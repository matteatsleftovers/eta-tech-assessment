package com.detroitlabs.etatechassessment.data;

import com.detroitlabs.etatechassessment.model.StarWarsCharacter;
import com.detroitlabs.etatechassessment.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CharacterRepository {

    @Autowired
    private StarWarsService starWarsService;

    private Map<Integer, List<StarWarsCharacter>> charactersInFilm = new HashMap<>();

    public List<StarWarsCharacter> getCharactersInFilm(int filmNumber) {
        if (charactersInFilm.get(filmNumber) == null) {
            List<String> characterUrls = starWarsService.fetchFilm(filmNumber).getCharacterUrls();
            List<StarWarsCharacter> characters = new ArrayList<>();
            for (String characterUrl : characterUrls) {
                StarWarsCharacter character = starWarsService.fetchCharacter(characterUrl);
                characters.add(character);
            }
            charactersInFilm.put(filmNumber, characters);
        }
        return charactersInFilm.get(filmNumber);
    }

}
