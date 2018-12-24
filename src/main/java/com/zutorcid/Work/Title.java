
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
    "title",
    "subtitle",
    "translated-title"
})
public class Title {

    @JsonProperty("title")
    private Title_ title;
    @JsonProperty("subtitle")
    private Object subtitle;
    @JsonProperty("translated-title")
    private Object translatedTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public Title_ getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title_ title) {
        this.title = title;
    }

    @JsonProperty("subtitle")
    public Object getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("translated-title")
    public Object getTranslatedTitle() {
        return translatedTitle;
    }

    @JsonProperty("translated-title")
    public void setTranslatedTitle(Object translatedTitle) {
        this.translatedTitle = translatedTitle;
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
