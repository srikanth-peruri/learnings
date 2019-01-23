
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
    "references",
    "type"
})
public class Variable_ {

    @JsonProperty("annotations")
    private List<Object> annotations = null;
    @JsonProperty("location")
    private Location___ location;
    @JsonProperty("modifiers")
    private List<Object> modifiers = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("references")
    private List<Reference____> references = null;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Variable_() {
    }

    /**
     * 
     * @param references
     * @param location
     * @param name
     * @param annotations
     * @param type
     * @param modifiers
     */
    public Variable_(List<Object> annotations, Location___ location, List<Object> modifiers, String name, List<Reference____> references, String type) {
        super();
        this.annotations = annotations;
        this.location = location;
        this.modifiers = modifiers;
        this.name = name;
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
    public Location___ getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location___ location) {
        this.location = location;
    }

    @JsonProperty("modifiers")
    public List<Object> getModifiers() {
        return modifiers;
    }

    @JsonProperty("modifiers")
    public void setModifiers(List<Object> modifiers) {
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

    @JsonProperty("references")
    public List<Reference____> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Reference____> references) {
        this.references = references;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
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
