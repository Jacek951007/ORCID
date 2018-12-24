
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
    "contributor-sequence",
    "contributor-role"
})
public class ContributorAttributes {

    @JsonProperty("contributor-sequence")
    private String contributorSequence;
    @JsonProperty("contributor-role")
    private String contributorRole;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contributor-sequence")
    public String getContributorSequence() {
        return contributorSequence;
    }

    @JsonProperty("contributor-sequence")
    public void setContributorSequence(String contributorSequence) {
        this.contributorSequence = contributorSequence;
    }

    @JsonProperty("contributor-role")
    public String getContributorRole() {
        return contributorRole;
    }

    @JsonProperty("contributor-role")
    public void setContributorRole(String contributorRole) {
        this.contributorRole = contributorRole;
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
