
package com.zutorcid.Employment;

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
    "department-name",
    "role-title",
    "start-date",
    "end-date",
    "organization",
    "visibility"
})
public class Employment {

    @JsonProperty("created-date")
    private CreatedDate createdDate;
    @JsonProperty("last-modified-date")
    private LastModifiedDate lastModifiedDate;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("put-code")
    private Integer putCode;
    @JsonProperty("path")
    private String path;
    @JsonProperty("department-name")
    private String departmentName;
    @JsonProperty("role-title")
    private String roleTitle;
    @JsonProperty("start-date")
    private StartDate startDate;
    @JsonProperty("end-date")
    private EndDate endDate;
    @JsonProperty("organization")
    private Organization organization;
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
    public Integer getPutCode() {
        return putCode;
    }

    @JsonProperty("put-code")
    public void setPutCode(Integer putCode) {
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

    @JsonProperty("department-name")
    public String getDepartmentName() {
        return departmentName;
    }

    @JsonProperty("department-name")
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @JsonProperty("role-title")
    public String getRoleTitle() {
        return roleTitle;
    }

    @JsonProperty("role-title")
    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    @JsonProperty("start-date")
    public StartDate getStartDate() {
        return startDate;
    }

    @JsonProperty("start-date")
    public void setStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("end-date")
    public EndDate getEndDate() {
        return endDate;
    }

    @JsonProperty("end-date")
    public void setEndDate(EndDate endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
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
