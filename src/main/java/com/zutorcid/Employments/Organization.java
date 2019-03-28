
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
    "name",
    "address",
    "disambiguated-organization"
})
public class Organization {

    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("disambiguated-organization")
    private DisambiguatedOrganization disambiguatedOrganization;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("disambiguated-organization")
    public DisambiguatedOrganization getDisambiguatedOrganization() {
        return disambiguatedOrganization;
    }

    @JsonProperty("disambiguated-organization")
    public void setDisambiguatedOrganization(DisambiguatedOrganization disambiguatedOrganization) {
        this.disambiguatedOrganization = disambiguatedOrganization;
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
