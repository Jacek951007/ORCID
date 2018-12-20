
package com.zutorcid.Works;

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
    "year",
    "month",
    "day",
    "media-type"
})
public class PublicationDate {

    @JsonProperty("year")
    private Year year;
    @JsonProperty("month")
    private Object month;
    @JsonProperty("day")
    private Object day;
    @JsonProperty("media-type")
    private Object mediaType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("year")
    public Year getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Year year) {
        this.year = year;
    }

    @JsonProperty("month")
    public Object getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(Object month) {
        this.month = month;
    }

    @JsonProperty("day")
    public Object getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Object day) {
        this.day = day;
    }

    @JsonProperty("media-type")
    public Object getMediaType() {
        return mediaType;
    }

    @JsonProperty("media-type")
    public void setMediaType(Object mediaType) {
        this.mediaType = mediaType;
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
