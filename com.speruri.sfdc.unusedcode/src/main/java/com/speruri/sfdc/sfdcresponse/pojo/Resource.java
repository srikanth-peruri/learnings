
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
    "size",
    "totalSize",
    "done",
    "queryLocator",
    "entityTypeName",
    "records"
})
public class Resource {

    @JsonProperty("size")
    private Integer size;
    @JsonProperty("totalSize")
    private Integer totalSize;
    @JsonProperty("done")
    private Boolean done;
    @JsonProperty("queryLocator")
    private Object queryLocator;
    @JsonProperty("entityTypeName")
    private String entityTypeName;
    @JsonProperty("records")
    private List<Record> records = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resource() {
    }

    /**
     * 
     * @param queryLocator
     * @param entityTypeName
     * @param done
     * @param records
     * @param totalSize
     * @param size
     */
    public Resource(Integer size, Integer totalSize, Boolean done, Object queryLocator, String entityTypeName, List<Record> records) {
        super();
        this.size = size;
        this.totalSize = totalSize;
        this.done = done;
        this.queryLocator = queryLocator;
        this.entityTypeName = entityTypeName;
        this.records = records;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("totalSize")
    public Integer getTotalSize() {
        return totalSize;
    }

    @JsonProperty("totalSize")
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    @JsonProperty("done")
    public Boolean getDone() {
        return done;
    }

    @JsonProperty("done")
    public void setDone(Boolean done) {
        this.done = done;
    }

    @JsonProperty("queryLocator")
    public Object getQueryLocator() {
        return queryLocator;
    }

    @JsonProperty("queryLocator")
    public void setQueryLocator(Object queryLocator) {
        this.queryLocator = queryLocator;
    }

    @JsonProperty("entityTypeName")
    public String getEntityTypeName() {
        return entityTypeName;
    }

    @JsonProperty("entityTypeName")
    public void setEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }

    @JsonProperty("records")
    public List<Record> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<Record> records) {
        this.records = records;
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
