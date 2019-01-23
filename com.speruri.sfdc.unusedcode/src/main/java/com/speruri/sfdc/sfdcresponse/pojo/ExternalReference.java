
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
    "methods",
    "name",
    "namespace",
    "references",
    "variables"
})
public class ExternalReference {

    @JsonProperty("methods")
    private List<ExternalMethodReference> methods = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("namespace")
    private Object namespace;
    @JsonProperty("references")
    private List<Reference_> references = null;
    @JsonProperty("variables")
    private List<Variable> variables = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalReference() {
    }

    /**
     * 
     * @param methods
     * @param references
     * @param name
     * @param variables
     * @param namespace
     */
    public ExternalReference(List<ExternalMethodReference> methods, String name, Object namespace, List<Reference_> references, List<Variable> variables) {
        super();
        this.methods = methods;
        this.name = name;
        this.namespace = namespace;
        this.references = references;
        this.variables = variables;
    }

    @JsonProperty("methods")
    public List<ExternalMethodReference> getMethods() {
        return methods;
    }

    @JsonProperty("methods")
    public void setMethods(List<ExternalMethodReference> methods) {
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

    @JsonProperty("references")
    public List<Reference_> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Reference_> references) {
        this.references = references;
    }

    @JsonProperty("variables")
    public List<Variable> getVariables() {
        return variables;
    }

    @JsonProperty("variables")
    public void setVariables(List<Variable> variables) {
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
