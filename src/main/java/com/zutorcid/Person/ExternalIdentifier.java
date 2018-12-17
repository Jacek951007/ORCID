
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
    "external-id-type",
    "external-id-value",
    "external-id-url",
    "external-id-relationship",
    "visibility",
    "path",
    "put-code",
    "display-index"
})
public class ExternalIdentifier {

    @JsonProperty("created-date")
    private CreatedDate_______ createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate______________ lastModifiedDate;
    @JsonProperty("source")
    private Source______ source;
    @JsonProperty("external-id-type")
    private String externalIdType;
    @JsonProperty("external-id-value")
    private String externalIdValue;
    @JsonProperty("external-id-url")
    private ExternalIdUrl externalIdUrl;
    @JsonProperty("external-id-relationship")
    private String externalIdRelationship;
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
    public CreatedDate_______ getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created-date")
    public void setCreatedDate(CreatedDate_______ createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("last-modified-date")
    public LastModifiedDate______________ getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate______________ lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("source")
    public Source______ getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source______ source) {
        this.source = source;
    }

    @JsonProperty("external-id-type")
    public String getExternalIdType() {
        return externalIdType;
    }

    @JsonProperty("external-id-type")
    public void setExternalIdType(String externalIdType) {
        this.externalIdType = externalIdType;
    }

    @JsonProperty("external-id-value")
    public String getExternalIdValue() {
        return externalIdValue;
    }

    @JsonProperty("external-id-value")
    public void setExternalIdValue(String externalIdValue) {
        this.externalIdValue = externalIdValue;
    }

    @JsonProperty("external-id-url")
    public ExternalIdUrl getExternalIdUrl() {
        return externalIdUrl;
    }

    @JsonProperty("external-id-url")
    public void setExternalIdUrl(ExternalIdUrl externalIdUrl) {
        this.externalIdUrl = externalIdUrl;
    }

    @JsonProperty("external-id-relationship")
    public String getExternalIdRelationship() {
        return externalIdRelationship;
    }

    @JsonProperty("external-id-relationship")
    public void setExternalIdRelationship(String externalIdRelationship) {
        this.externalIdRelationship = externalIdRelationship;
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
