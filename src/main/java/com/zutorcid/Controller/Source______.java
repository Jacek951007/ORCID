
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
public class Source______ {

    @JsonProperty("source-orcid")
    private SourceOrcid______ sourceOrcid;
    @JsonProperty("source-client-id")
    private SourceClientId______ sourceClientId;
    @JsonProperty("source-name")
    private SourceName______ sourceName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("source-orcid")
    public SourceOrcid______ getSourceOrcid() {
        return sourceOrcid;
    }

    @JsonProperty("source-orcid")
    public void setSourceOrcid(SourceOrcid______ sourceOrcid) {
        this.sourceOrcid = sourceOrcid;
    }

    @JsonProperty("source-client-id")
    public SourceClientId______ getSourceClientId() {
        return sourceClientId;
    }

    @JsonProperty("source-client-id")
    public void setSourceClientId(SourceClientId______ sourceClientId) {
        this.sourceClientId = sourceClientId;
    }

    @JsonProperty("source-name")
    public SourceName______ getSourceName() {
        return sourceName;
    }

    @JsonProperty("source-name")
    public void setSourceName(SourceName______ sourceName) {
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
