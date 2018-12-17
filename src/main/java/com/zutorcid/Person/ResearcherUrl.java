
package com.zutorcid.Person;

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
    "url-name",
    "url",
    "visibility",
    "path",
    "put-code",
    "display-index"
})
public class ResearcherUrl {

    @JsonProperty("created-date")
    private CreatedDate___ createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate______ lastModifiedDate;
    @JsonProperty("source")
    private Source__ source;
    @JsonProperty("url-name")
    private String urlName;
    @JsonProperty("url")
    private Url url;
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
    public CreatedDate___ getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created-date")
    public void setCreatedDate(CreatedDate___ createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("last-modified-date")
    public LastModifiedDate______ getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate______ lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("source")
    public Source__ getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source__ source) {
        this.source = source;
    }

    @JsonProperty("url-name")
    public String getUrlName() {
        return urlName;
    }

    @JsonProperty("url-name")
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    @JsonProperty("url")
    public Url getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Url url) {
        this.url = url;
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
