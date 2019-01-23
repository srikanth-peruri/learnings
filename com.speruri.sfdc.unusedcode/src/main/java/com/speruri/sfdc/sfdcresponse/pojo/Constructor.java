
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
    "type"
})
public class Constructor {

    @JsonProperty("annotations")
    private List<Object> annotations = null;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("modifiers")
    private List<String> modifiers = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("parameters")
    private List<Object> parameters = null;
    @JsonProperty("references")
    private List<Object> references = null;
    @JsonProperty("type")
    private Object type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Constructor() {
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
     */
    public Constructor(List<Object> annotations, Location location, List<String> modifiers, String name, List<Object> parameters, List<Object> references, Object type) {
        super();
        this.annotations = annotations;
        this.location = location;
        this.modifiers = modifiers;
        this.name = name;
        this.parameters = parameters;
        this.references = references;
        this.type = type;
    }

    @JsonProperty("annotations")
    public List<Object> getAnnotations() {
        return annotations;
    }

    @JsonProperty("annotations")
    public void setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
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
    public List<Object> getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("references")
    public List<Object> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Object> references) {
        this.references = references;
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
