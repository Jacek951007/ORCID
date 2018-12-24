
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
    "contributor-orcid",
    "credit-name",
    "contributor-email",
    "contributor-attributes"
})
public class Contributor {

    @JsonProperty("contributor-orcid")
    private ContributorOrcid contributorOrcid;
    @JsonProperty("credit-name")
    private CreditName creditName;
    @JsonProperty("contributor-email")
    private Object contributorEmail;
    @JsonProperty("contributor-attributes")
    private ContributorAttributes contributorAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contributor-orcid")
    public ContributorOrcid getContributorOrcid() {
        return contributorOrcid;
    }

    @JsonProperty("contributor-orcid")
    public void setContributorOrcid(ContributorOrcid contributorOrcid) {
        this.contributorOrcid = contributorOrcid;
    }

    @JsonProperty("credit-name")
    public CreditName getCreditName() {
        return creditName;
    }

    @JsonProperty("credit-name")
    public void setCreditName(CreditName creditName) {
        this.creditName = creditName;
    }

    @JsonProperty("contributor-email")
    public Object getContributorEmail() {
        return contributorEmail;
    }

    @JsonProperty("contributor-email")
    public void setContributorEmail(Object contributorEmail) {
        this.contributorEmail = contributorEmail;
    }

    @JsonProperty("contributor-attributes")
    public ContributorAttributes getContributorAttributes() {
        return contributorAttributes;
    }

    @JsonProperty("contributor-attributes")
    public void setContributorAttributes(ContributorAttributes contributorAttributes) {
        this.contributorAttributes = contributorAttributes;
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
