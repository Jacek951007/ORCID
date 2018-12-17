
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
    "given-names",
    "family-name",
    "credit-name",
    "source",
    "visibility",
    "path"
})
public class Name {

    @JsonProperty("created-date")
    private CreatedDate createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate_ lastModifiedDate;
    @JsonProperty("given-names")
    private GivenNames givenNames;
    @JsonProperty("family-name")
    private FamilyName familyName;
    @JsonProperty("credit-name")
    private CreditName creditName;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("path")
    private String path;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created-date")
    public CreatedDate getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created-date")
    public void setCreatedDate(CreatedDate createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("last-modified-date")
    public LastModifiedDate_ getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate_ lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("given-names")
    public GivenNames getGivenNames() {
        return givenNames;
    }

    @JsonProperty("given-names")
    public void setGivenNames(GivenNames givenNames) {
        this.givenNames = givenNames;
    }

    @JsonProperty("family-name")
    public FamilyName getFamilyName() {
        return familyName;
    }

    @JsonProperty("family-name")
    public void setFamilyName(FamilyName familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("credit-name")
    public CreditName getCreditName() {
        return creditName;
    }

    @JsonProperty("credit-name")
    public void setCreditName(CreditName creditName) {
        this.creditName = creditName;
    }

    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
