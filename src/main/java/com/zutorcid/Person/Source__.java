
package com.zutorcid.Person;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.zutorcid.Person.SourceClientId__;
import com.zutorcid.Person.SourceName__;
import com.zutorcid.Person.SourceOrcid__;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source-orcid",
    "source-client-id",
    "source-name"
})
public class Source__ {

    @JsonProperty("source-orcid")
    private SourceOrcid__ sourceOrcid;
    @JsonProperty("source-client-id")
    private SourceClientId__ sourceClientId;
    @JsonProperty("source-name")
    private SourceName__ sourceName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("source-orcid")
    public SourceOrcid__ getSourceOrcid() {
        return sourceOrcid;
    }

    @JsonProperty("source-orcid")
    public void setSourceOrcid(SourceOrcid__ sourceOrcid) {
        this.sourceOrcid = sourceOrcid;
    }

    @JsonProperty("source-client-id")
    public SourceClientId__ getSourceClientId() {
        return sourceClientId;
    }

    @JsonProperty("source-client-id")
    public void setSourceClientId(SourceClientId__ sourceClientId) {
        this.sourceClientId = sourceClientId;
    }

    @JsonProperty("source-name")
    public SourceName__ getSourceName() {
        return sourceName;
    }

    @JsonProperty("source-name")
    public void setSourceName(SourceName__ sourceName) {
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
