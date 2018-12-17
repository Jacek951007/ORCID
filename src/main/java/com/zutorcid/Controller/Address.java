
package com.zutorcid.Controller;

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
    "created-date",
    "last-modified-date",
    "source",
    "country",
    "visibility",
    "path",
    "put-code",
    "display-index"
})
public class Address {

    @JsonProperty("created-date")
    private CreatedDate_____ createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate__________ lastModifiedDate;
    @JsonProperty("source")
    private Source____ source;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("path")
    private String path;
    @JsonProperty("put-code")
    private Integer putCode;
    @JsonProperty("display-index")
    private Integer displayIndex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created-date")
    public CreatedDate_____ getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created-date")
    public void setCreatedDate(CreatedDate_____ createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("last-modified-date")
    public LastModifiedDate__________ getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate__________ lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("source")
    public Source____ getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source____ source) {
        this.source = source;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("put-code")
    public Integer getPutCode() {
        return putCode;
    }

    @JsonProperty("put-code")
    public void setPutCode(Integer putCode) {
        this.putCode = putCode;
    }

    @JsonProperty("display-index")
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    @JsonProperty("display-index")
    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
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
