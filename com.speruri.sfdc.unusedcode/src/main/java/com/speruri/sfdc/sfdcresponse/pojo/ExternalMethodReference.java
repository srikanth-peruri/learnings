
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
    "argTypes",
    "isStatic",
    "methodDoc",
    "name",
    "parameters",
    "references",
    "returnType"
})
public class ExternalMethodReference {

    @JsonProperty("argTypes")
    private List<Object> argTypes = null;
    @JsonProperty("isStatic")
    private Boolean isStatic;
    @JsonProperty("methodDoc")
    private Object methodDoc;
    @JsonProperty("name")
    private String name;
    @JsonProperty("parameters")
    private List<Object> parameters = null;
    @JsonProperty("references")
    private List<Reference> references = null;
    @JsonProperty("returnType")
    private Object returnType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalMethodReference() {
    }

    /**
     * 
     * @param isStatic
     * @param argTypes
     * @param references
     * @param methodDoc
     * @param name
     * @param parameters
     * @param returnType
     */
    public ExternalMethodReference(List<Object> argTypes, Boolean isStatic, Object methodDoc, String name, List<Object> parameters, List<Reference> references, Object returnType) {
        super();
        this.argTypes = argTypes;
        this.isStatic = isStatic;
        this.methodDoc = methodDoc;
        this.name = name;
        this.parameters = parameters;
        this.references = references;
        this.returnType = returnType;
    }

    @JsonProperty("argTypes")
    public List<Object> getArgTypes() {
        return argTypes;
    }

    @JsonProperty("argTypes")
    public void setArgTypes(List<Object> argTypes) {
        this.argTypes = argTypes;
    }

    @JsonProperty("isStatic")
    public Boolean getIsStatic() {
        return isStatic;
    }

    @JsonProperty("isStatic")
    public void setIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
    }

    @JsonProperty("methodDoc")
    public Object getMethodDoc() {
        return methodDoc;
    }

    @JsonProperty("methodDoc")
    public void setMethodDoc(Object methodDoc) {
        this.methodDoc = methodDoc;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("parameters")
    public List<Object> getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("references")
    public List<Reference> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    @JsonProperty("returnType")
    public Object getReturnType() {
        return returnType;
    }

    @JsonProperty("returnType")
    public void setReturnType(Object returnType) {
        this.returnType = returnType;
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
