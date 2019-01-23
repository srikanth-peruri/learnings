
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
public class TableDeclaration {

    @JsonProperty("annotations")
    private List<Annotation_> annotations = null;
    @JsonProperty("location")
    private Location__ location;
    @JsonProperty("modifiers")
    private List<String> modifiers = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("references")
    private List<Object> references = null;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TableDeclaration() {
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
    public TableDeclaration(List<Annotation_> annotations, Location__ location, List<String> modifiers, String name, List<Object> references, String type) {
        super();
        this.annotations = annotations;
        this.location = location;
        this.modifiers = modifiers;
        this.name = name;
        this.references = references;
        this.type = type;
    }

    @JsonProperty("annotations")
    public List<Annotation_> getAnnotations() {
        return annotations;
    }

    @JsonProperty("annotations")
    public void setAnnotations(List<Annotation_> annotations) {
        this.annotations = annotations;
    }

    @JsonProperty("location")
    public Location__ getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__ location) {
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

    @JsonProperty("references")
    public List<Object> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Object> references) {
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
