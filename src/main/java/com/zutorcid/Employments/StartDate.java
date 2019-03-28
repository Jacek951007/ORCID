
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
    "year",
    "month",
    "day"
})
public class StartDate {

    @JsonProperty("year")
    private Year year;
    @JsonProperty("month")
    private Month month;
    @JsonProperty("day")
    private Day day;
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
    public Month getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(Month month) {
        this.month = month;
    }

    @JsonProperty("day")
    public Day getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Day day) {
        this.day = day;
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
