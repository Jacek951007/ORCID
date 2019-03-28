
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
public class EndDate {

    @JsonProperty("year")
    private Year_ year;
    @JsonProperty("month")
    private Month_ month;
    @JsonProperty("day")
    private Day_ day;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("year")
    public Year_ getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Year_ year) {
        this.year = year;
    }

    @JsonProperty("month")
    public Month_ getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(Month_ month) {
        this.month = month;
    }

    @JsonProperty("day")
    public Day_ getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Day_ day) {
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
