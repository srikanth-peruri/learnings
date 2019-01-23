
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
    "annotations",
    "location",
    "modifiers",
    "name",
    "parameters",
    "references",
    "returnType",
    "type"
})
public class Method {

    @JsonProperty("annotations")
    private List<Annotation> annotations = null;
    @JsonProperty("location")
    private Location_ location;
    @JsonProperty("modifiers")
    private List<String> modifiers = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("parameters")
    private List<Parameter> parameters = null;
    @JsonProperty("references")
    private List<Reference___> references = null;
    @JsonProperty("returnType")
    private String returnType;
    @JsonProperty("type")
    private Object type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Method() {
    }

    /**
     * 
     * @param references
     * @param location
     * @param name
     * @param parameters
     * @param annotations
     * @param type
     * @param modifiers
     * @param returnType
     */
    public Method(List<Annotation> annotations, Location_ location, List<String> modifiers, String name, List<Parameter> parameters, List<Reference___> references, String returnType, Object type) {
        super();
        this.annotations = annotations;
        this.location = location;
        this.modifiers = modifiers;
        this.name = name;
        this.parameters = parameters;
        this.references = references;
        this.returnType = returnType;
        this.type = type;
    }

    @JsonProperty("annotations")
    public List<Annotation> getAnnotations() {
        return annotations;
    }

    @JsonProperty("annotations")
    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    @JsonProperty("location")
    public Location_ getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location_ location) {
        this.location = location;
    }

    @JsonProperty("modifiers")
    public List<String> getModifiers() {
        return modifiers;
    }

    @JsonProperty("modifiers")
    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
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
    public List<Parameter> getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("references")
    public List<Reference___> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Reference___> references) {
        this.references = references;
    }

    @JsonProperty("returnType")
    public String getReturnType() {
        return returnType;
    }

    @JsonProperty("returnType")
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
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
