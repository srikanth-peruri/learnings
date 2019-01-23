
package com.speruri.sfdc.sfdcresponse.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "constructors",
    "externalReferences",
    "id",
    "innerClasses",
    "interfaces",
    "key",
    "methods",
    "name",
    "namespace",
    "parentClass",
    "properties",
    "tableDeclaration",
    "variables"
})
public class SymbolTable {

    @JsonProperty("constructors")
    private List<Constructor> constructors = null;
    @JsonProperty("externalReferences")
    private List<ExternalReference> externalReferences = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("innerClasses")
    private List<Object> innerClasses = null;
    @JsonProperty("interfaces")
    private List<Object> interfaces = null;
    @JsonProperty("key")
    private String key;
    @JsonProperty("methods")
    private List<Method> methods = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("namespace")
    private Object namespace;
    @JsonProperty("parentClass")
    private String parentClass;
    @JsonProperty("properties")
    private List<Object> properties = null;
    @JsonProperty("tableDeclaration")
    private TableDeclaration tableDeclaration;
    @JsonProperty("variables")
    private List<Variable_> variables = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SymbolTable() {
    }

    /**
     * 
     * @param methods
     * @param parentClass
     * @param externalReferences
     * @param innerClasses
     * @param properties
     * @param constructors
     * @param variables
     * @param namespace
     * @param id
     * @param name
     * @param interfaces
     * @param tableDeclaration
     * @param key
     */
    public SymbolTable(List<Constructor> constructors, List<ExternalReference> externalReferences, String id, List<Object> innerClasses, List<Object> interfaces, String key, List<Method> methods, String name, Object namespace, String parentClass, List<Object> properties, TableDeclaration tableDeclaration, List<Variable_> variables) {
        super();
        this.constructors = constructors;
        this.externalReferences = externalReferences;
        this.id = id;
        this.innerClasses = innerClasses;
        this.interfaces = interfaces;
        this.key = key;
        this.methods = methods;
        this.name = name;
        this.namespace = namespace;
        this.parentClass = parentClass;
        this.properties = properties;
        this.tableDeclaration = tableDeclaration;
        this.variables = variables;
    }

    @JsonProperty("constructors")
    public List<Constructor> getConstructors() {
        return constructors;
    }

    @JsonProperty("constructors")
    public void setConstructors(List<Constructor> constructors) {
        this.constructors = constructors;
    }

    @JsonProperty("externalReferences")
    public List<ExternalReference> getExternalReferences() {
        return externalReferences;
    }

    @JsonProperty("externalReferences")
    public void setExternalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("innerClasses")
    public List<Object> getInnerClasses() {
        return innerClasses;
    }

    @JsonProperty("innerClasses")
    public void setInnerClasses(List<Object> innerClasses) {
        this.innerClasses = innerClasses;
    }

    @JsonProperty("interfaces")
    public List<Object> getInterfaces() {
        return interfaces;
    }

    @JsonProperty("interfaces")
    public void setInterfaces(List<Object> interfaces) {
        this.interfaces = interfaces;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("methods")
    public List<Method> getMethods() {
        return methods;
    }

    @JsonProperty("methods")
    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("namespace")
    public Object getNamespace() {
        return namespace;
    }

    @JsonProperty("namespace")
    public void setNamespace(Object namespace) {
        this.namespace = namespace;
    }

    @JsonProperty("parentClass")
    public String getParentClass() {
        return parentClass;
    }

    @JsonProperty("parentClass")
    public void setParentClass(String parentClass) {
        this.parentClass = parentClass;
    }

    @JsonProperty("properties")
    public List<Object> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

    @JsonProperty("tableDeclaration")
    public TableDeclaration getTableDeclaration() {
        return tableDeclaration;
    }

    @JsonProperty("tableDeclaration")
    public void setTableDeclaration(TableDeclaration tableDeclaration) {
        this.tableDeclaration = tableDeclaration;
    }

    @JsonProperty("variables")
    public List<Variable_> getVariables() {
        return variables;
    }

    @JsonProperty("variables")
    public void setVariables(List<Variable_> variables) {
        this.variables = variables;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
