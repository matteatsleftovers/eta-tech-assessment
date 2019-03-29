package com.detroitlabs.etatechassessment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsCharacter {

    private String name;
    private String birthYear;
    private String gender;
    private String homeworldUrl;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("homeworld")
    public String getHomeworldUrl() {
        return homeworldUrl;
    }

    @JsonProperty("homeworld")
    public void setHomeworldUrl(String homeworldUrl) {
        this.homeworldUrl = homeworldUrl;
    }
}
