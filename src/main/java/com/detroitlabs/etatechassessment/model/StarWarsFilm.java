package com.detroitlabs.etatechassessment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsFilm {

    private String title;
    private List<String> characterUrls;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("characters")
    public List<String> getCharacterUrls() {
        return characterUrls;
    }

    @JsonProperty("characters")
    public void setCharacterUrls(List<String> characterUrls) {
        this.characterUrls = characterUrls;
    }
}
