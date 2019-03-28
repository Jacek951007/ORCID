
package com.zutorcid.Employments;

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
    "last-modified-date",
    "employment-summary",
    "path"
})
public class GetEmployments {

    @JsonProperty("last-modified-date")
    private LastModifiedDate lastModifiedDate;
    @JsonProperty("employment-summary")
    private List<EmploymentSummary> employmentSummary = null;
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

    @JsonProperty("employment-summary")
    public List<EmploymentSummary> getEmploymentSummary() {
        return employmentSummary;
    }

    @JsonProperty("employment-summary")
    public void setEmploymentSummary(List<EmploymentSummary> employmentSummary) {
        this.employmentSummary = employmentSummary;
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
