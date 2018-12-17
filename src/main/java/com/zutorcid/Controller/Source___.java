
package com.zutorcid.Controller;

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
    "source-orcid",
    "source-client-id",
    "source-name"
})
public class Source___ {

    @JsonProperty("source-orcid")
    private SourceOrcid___ sourceOrcid;
    @JsonProperty("source-client-id")
    private SourceClientId___ sourceClientId;
    @JsonProperty("source-name")
    private SourceName___ sourceName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("source-orcid")
    public SourceOrcid___ getSourceOrcid() {
        return sourceOrcid;
    }

    @JsonProperty("source-orcid")
    public void setSourceOrcid(SourceOrcid___ sourceOrcid) {
        this.sourceOrcid = sourceOrcid;
    }

    @JsonProperty("source-client-id")
    public SourceClientId___ getSourceClientId() {
        return sourceClientId;
    }

    @JsonProperty("source-client-id")
    public void setSourceClientId(SourceClientId___ sourceClientId) {
        this.sourceClientId = sourceClientId;
    }

    @JsonProperty("source-name")
    public SourceName___ getSourceName() {
        return sourceName;
    }

    @JsonProperty("source-name")
    public void setSourceName(SourceName___ sourceName) {
        this.sourceName = sourceName;
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
