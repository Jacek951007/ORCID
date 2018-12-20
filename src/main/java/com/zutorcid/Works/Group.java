
package com.zutorcid.Works;

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
    "external-ids",
    "work-summary"
})
public class Group {

    @JsonProperty("last-modified-date")
    private LastModifiedDate_ lastModifiedDate;
    @JsonProperty("external-ids")
    private ExternalIds externalIds;
    @JsonProperty("work-summary")
    private List<WorkSummary> workSummary = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("last-modified-date")
    public LastModifiedDate_ getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last-modified-date")
    public void setLastModifiedDate(LastModifiedDate_ lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("external-ids")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    @JsonProperty("external-ids")
    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    @JsonProperty("work-summary")
    public List<WorkSummary> getWorkSummary() {
        return workSummary;
    }

    @JsonProperty("work-summary")
    public void setWorkSummary(List<WorkSummary> workSummary) {
        this.workSummary = workSummary;
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
