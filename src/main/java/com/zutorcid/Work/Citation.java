
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
    "citation-type",
    "citation-value"
})
public class Citation {

    @JsonProperty("citation-type")
    private String citationType;
    @JsonProperty("citation-value")
    private String citationValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("citation-type")
    public String getCitationType() {
        return citationType;
    }

    @JsonProperty("citation-type")
    public void setCitationType(String citationType) {
        this.citationType = citationType;
    }

    @JsonProperty("citation-value")
    public String getCitationValue() {
        return citationValue;
    }

    @JsonProperty("citation-value")
    public void setCitationValue(String citationValue) {
        this.citationValue = citationValue;
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
