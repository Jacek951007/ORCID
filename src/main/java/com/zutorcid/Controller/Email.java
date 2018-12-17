
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
    "email",
    "path",
    "visibility",
    "verified",
    "primary",
    "put-code"
})
public class Email {

    @JsonProperty("created-date")
    private CreatedDate____ createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate________ lastModifiedDate;
    @JsonProperty("source")
    private Source___ source;
    @JsonProperty("email")
    private String email;
    @JsonProperty("path")
    private String path;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonProperty("put-code")
    private Integer putCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created-date")
    public CreatedDate____ getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created-date")
    public void setCreatedDate(CreatedDate____ createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("last-modified-date")
    public LastModifiedDate________ getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate________ lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("source")
    public Source___ getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source___ source) {
        this.source = source;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @JsonProperty("put-code")
    public Integer getPutCode() {
        return putCode;
    }

    @JsonProperty("put-code")
    public void setPutCode(Integer putCode) {
        this.putCode = putCode;
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
