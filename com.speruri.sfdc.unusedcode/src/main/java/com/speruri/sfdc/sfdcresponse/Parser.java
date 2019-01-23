package com.speruri.sfdc.sfdcresponse;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.speruri.sfdc.sfdcresponse.pojo.ExternalReference;
import com.speruri.sfdc.sfdcresponse.pojo.ExternalMethodReference;
import com.speruri.sfdc.sfdcresponse.pojo.Method;
import com.speruri.sfdc.sfdcresponse.pojo.Record;
import com.speruri.sfdc.sfdcresponse.pojo.Resource;
import com.speruri.sfdc.sfdcresponse.pojo.SymbolTable;

public class Parser {

	public static void main(String[] args) throws Exception {

		String jsonString = FileUtils.readFileToString(new File("file.txt"));
		System.out.println("JSON String is : " + jsonString);
		ObjectMapper objectMapper = new ObjectMapper();
		Resource resource = objectMapper.readValue(jsonString, new Resource().getClass());
		System.out.println("REsource : " + resource.getSize());

		// Map declared methods and external method references from SymbolTable's
		Set<String> declaredMethods = new HashSet();
		Set<String> methodReferences = new HashSet();
		TreeSet<String> unusedMethods = new TreeSet<>();
		for (Record apexClassMember : resource.getRecords()) {
			// List class methods defined and referenced
			SymbolTable symbolTable = apexClassMember.getSymbolTable();
			if (symbolTable == null) // No symbol table, then class likely is invalid
				continue;
			for (Method method : symbolTable.getMethods()) {
				// Annotations are not exposed currently, following attempts to detect test
				// methods to avoid giving false positives
				if (method.getName().toLowerCase().contains("test") && method.getModifiers().contains("private")
						&& (method.getReferences() == null || method.getReferences().size() == 0))
					continue;
				// Skip Global methods as implicitly these are referenced
				if (method.getModifiers().contains("global"))
					continue;
				// Bug? (public method from System.Test?)
				if (method.getName().equals("aot"))
					continue;
				// Add the qualified method name to the list
				declaredMethods.add(symbolTable.getName() + "." + method.getName());
				// Any local references to this method?
				if (method.getReferences() != null && method.getReferences().size() > 0)
					methodReferences.add(symbolTable.getName() + "." + method.getName());
			}
			// Add any method references this class makes to other class methods
			for (ExternalReference externalRef : symbolTable.getExternalReferences()) {
				for (ExternalMethodReference externalMethodRef : externalRef.getMethods()) {
					methodReferences.add(externalRef.getName() + "." + externalMethodRef.getName());
				}
			}

		}
		// List declaredMethods with no external references

		for (String delcaredMethodName : declaredMethods) {
			if (!methodReferences.contains(delcaredMethodName)) {
				unusedMethods.add(delcaredMethodName);
			}
		}

		// Render HTML table to display results
		StringBuilder sb = new StringBuilder();
		sb.append("<table>");
		for (String methodName : unusedMethods) {
			sb.append("<tr><td>" + methodName + "</td></tr>");
		}
		sb.append("</table>");
		System.out.println(sb.toString());

	}
}
