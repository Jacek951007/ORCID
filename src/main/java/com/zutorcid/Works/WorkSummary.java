
package com.zutorcid.Works;

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
    "put-code",
    "created-date",
    "last-modified-date",
    "source",
    "title",
    "external-ids",
    "type",
    "publication-date",
    "visibility",
    "path",
    "display-index"
})
public class WorkSummary {

    @JsonProperty("put-code")
    private Integer putCode;
    @JsonProperty("created-date")
    private CreatedDate createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate__ lastModifiedDate;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("title")
    private Title title;
    @JsonProperty("external-ids")
    private ExternalIds_ externalIds;
    @JsonProperty("type")
    private String type;
    @JsonProperty("publication-date")
    private PublicationDate publicationDate;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("path")
    private String path;
    @JsonProperty("display-index")
    private String displayIndex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("put-code")
    public int getPutCode() {
        return putCode;
    }

    @JsonProperty("put-code")
    public void setPutCode(Integer putCode) {
        this.putCode = putCode;
    }

    @JsonProperty("created-date")
    public CreatedDate getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created-date")
    public void setCreatedDate(CreatedDate createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("last-modified-date")
    public LastModifiedDate__ getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate__ lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("external-ids")
    public ExternalIds_ getExternalIds() {
        return externalIds;
    }

    @JsonProperty("external-ids")
    public void setExternalIds(ExternalIds_ externalIds) {
        this.externalIds = externalIds;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("publication-date")
    public PublicationDate getPublicationDate() {
        return publicationDate;
    }

    @JsonProperty("publication-date")
    public void setPublicationDate(PublicationDate publicationDate) {
        this.publicationDate = publicationDate;
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

    @JsonProperty("display-index")
    public String getDisplayIndex() {
        return displayIndex;
    }

    @JsonProperty("display-index")
    public void setDisplayIndex(String displayIndex) {
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
