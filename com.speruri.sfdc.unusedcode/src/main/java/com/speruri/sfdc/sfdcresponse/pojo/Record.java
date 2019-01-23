
package com.speruri.sfdc.sfdcresponse.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attributes",
    "Body",
    "ContentEntityId",
    "SymbolTable"
})
public class Record {

    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("Body")
    private String body;
    @JsonProperty("ContentEntityId")
    private String contentEntityId;
    @JsonProperty("SymbolTable")
    private SymbolTable symbolTable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param body
     * @param contentEntityId
     * @param symbolTable
     * @param attributes
     */
    public Record(Attributes attributes, String body, String contentEntityId, SymbolTable symbolTable) {
        super();
        this.attributes = attributes;
        this.body = body;
        this.contentEntityId = contentEntityId;
        this.symbolTable = symbolTable;
    }

    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("Body")
    public String getBody() {
        return body;
    }

    @JsonProperty("Body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("ContentEntityId")
    public String getContentEntityId() {
        return contentEntityId;
    }

    @JsonProperty("ContentEntityId")
    public void setContentEntityId(String contentEntityId) {
        this.contentEntityId = contentEntityId;
    }

    @JsonProperty("SymbolTable")
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @JsonProperty("SymbolTable")
    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
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
