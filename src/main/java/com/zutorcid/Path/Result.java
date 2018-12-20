
package com.zutorcid.Path;

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
    "orcid-identifier"
})
public class Result {

    @JsonProperty("orcid-identifier")
    private OrcidIdentifier orcidIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("orcid-identifier")
    public OrcidIdentifier getOrcidIdentifier() {
        return orcidIdentifier;
    }

    @JsonProperty("orcid-identifier")
    public void setOrcidIdentifier(OrcidIdentifier orcidIdentifier) {
        this.orcidIdentifier = orcidIdentifier;
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
