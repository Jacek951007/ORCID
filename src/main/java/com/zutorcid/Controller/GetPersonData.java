
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
    "last-modified-date",
    "name",
    "other-names",
    "biography",
    "researcher-urls",
    "emails",
    "addresses",
    "keywords",
    "external-identifiers",
    "path"
})
public class GetPersonData {

    @JsonProperty("last-modified-date")
    private LastModifiedDate lastModifiedDate;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("other-names")
    private OtherNames otherNames;
    @JsonProperty("biography")
    private Biography biography;
    @JsonProperty("researcher-urls")
    private ResearcherUrls researcherUrls;
    @JsonProperty("emails")
    private Emails emails;
    @JsonProperty("addresses")
    private Addresses addresses;
    @JsonProperty("keywords")
    private Keywords keywords;
    @JsonProperty("external-identifiers")
    private ExternalIdentifiers externalIdentifiers;
    @JsonProperty("path")
    private String path;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("last-modified-date")
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("other-names")
    public OtherNames getOtherNames() {
        return otherNames;
    }

    @JsonProperty("other-names")
    public void setOtherNames(OtherNames otherNames) {
        this.otherNames = otherNames;
    }

    @JsonProperty("biography")
    public Biography getBiography() {
        return biography;
    }

    @JsonProperty("biography")
    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    @JsonProperty("researcher-urls")
    public ResearcherUrls getResearcherUrls() {
        return researcherUrls;
    }

    @JsonProperty("researcher-urls")
    public void setResearcherUrls(ResearcherUrls researcherUrls) {
        this.researcherUrls = researcherUrls;
    }

    @JsonProperty("emails")
    public Emails getEmails() {
        return emails;
    }

    @JsonProperty("emails")
    public void setEmails(Emails emails) {
        this.emails = emails;
    }

    @JsonProperty("addresses")
    public Addresses getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    @JsonProperty("keywords")
    public Keywords getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("external-identifiers")
    public ExternalIdentifiers getExternalIdentifiers() {
        return externalIdentifiers;
    }

    @JsonProperty("external-identifiers")
    public void setExternalIdentifiers(ExternalIdentifiers externalIdentifiers) {
        this.externalIdentifiers = externalIdentifiers;
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
