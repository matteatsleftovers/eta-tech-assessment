package com.detroitlabs.etatechassessment.service;

import com.detroitlabs.etatechassessment.model.StarWarsCharacter;
import com.detroitlabs.etatechassessment.model.StarWarsFilm;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StarWarsService {

    public StarWarsFilm fetchFilm(int filmNumber) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(
                "https://swapi.co/api/films/" + filmNumber + "/",
                HttpMethod.GET,
                buildHttpEntity(),
                StarWarsFilm.class
        ).getBody();
    }

    public StarWarsCharacter fetchCharacter(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                buildHttpEntity(),
                StarWarsCharacter.class
        ).getBody();
    }

    private HttpEntity buildHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Spring");
        return new HttpEntity(headers);
    }
}
