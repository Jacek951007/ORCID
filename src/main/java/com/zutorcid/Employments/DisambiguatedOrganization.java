
package com.zutorcid.Employments;

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
    "disambiguated-organization-identifier",
    "disambiguation-source"
})
public class DisambiguatedOrganization {

    @JsonProperty("disambiguated-organization-identifier")
    private String disambiguatedOrganizationIdentifier;
    @JsonProperty("disambiguation-source")
    private String disambiguationSource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("disambiguated-organization-identifier")
    public String getDisambiguatedOrganizationIdentifier() {
        return disambiguatedOrganizationIdentifier;
    }

    @JsonProperty("disambiguated-organization-identifier")
    public void setDisambiguatedOrganizationIdentifier(String disambiguatedOrganizationIdentifier) {
        this.disambiguatedOrganizationIdentifier = disambiguatedOrganizationIdentifier;
    }

    @JsonProperty("disambiguation-source")
    public String getDisambiguationSource() {
        return disambiguationSource;
    }

    @JsonProperty("disambiguation-source")
    public void setDisambiguationSource(String disambiguationSource) {
        this.disambiguationSource = disambiguationSource;
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
