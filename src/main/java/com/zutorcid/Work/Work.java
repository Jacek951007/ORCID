
package com.zutorcid.Work;

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
    "put-code",
    "path",
    "title",
    "journal-title",
    "short-description",
    "citation",
    "type",
    "publication-date",
    "external-ids",
    "url",
    "contributors",
    "language-code",
    "country",
    "visibility"
})
public class Work {

    @JsonProperty("created-date")
    private CreatedDate createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate lastModifiedDate;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("put-code")
    private Long putCode;
    @JsonProperty("path")
    private String path;
    @JsonProperty("title")
    private Title title;
    @JsonProperty("journal-title")
    private JournalTitle journalTitle;
    @JsonProperty("short-description")
    private String shortDescription;
    @JsonProperty("citation")
    private Citation citation;
    @JsonProperty("type")
    private String type;
    @JsonProperty("publication-date")
    private PublicationDate publicationDate;
    @JsonProperty("external-ids")
    private ExternalIds externalIds;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("contributors")
    private Contributors contributors;
    @JsonProperty("language-code")
    private Object languageCode;
    @JsonProperty("country")
    private Object country;
    @JsonProperty("visibility")
    private String visibility;
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
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
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

    @JsonProperty("put-code")
    public Long getPutCode() {
        return putCode;
    }

    @JsonProperty("put-code")
    public void setPutCode(Long putCode) {
        this.putCode = putCode;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("journal-title")
    public JournalTitle getJournalTitle() {
        return journalTitle;
    }

    @JsonProperty("journal-title")
    public void setJournalTitle(JournalTitle journalTitle) {
        this.journalTitle = journalTitle;
    }

    @JsonProperty("short-description")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("short-description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("citation")
    public Citation getCitation() {
        return citation;
    }

    @JsonProperty("citation")
    public void setCitation(Citation citation) {
        this.citation = citation;
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

    @JsonProperty("external-ids")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    @JsonProperty("external-ids")
    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("contributors")
    public Contributors getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(Contributors contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("language-code")
    public Object getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("language-code")
    public void setLanguageCode(Object languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Object country) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
