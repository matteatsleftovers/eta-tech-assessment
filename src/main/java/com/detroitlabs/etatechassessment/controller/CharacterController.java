package com.detroitlabs.etatechassessment.controller;

import com.detroitlabs.etatechassessment.data.CharacterRepository;
import com.detroitlabs.etatechassessment.model.StarWarsCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @RequestMapping(value = "/")
    public String displayCharacters(ModelMap modelMap) {
        List<StarWarsCharacter> characters = characterRepository.getCharactersInFilm(2);
        modelMap.put("characters", characters);
        return "home";
    }

    @RequestMapping(value = "/details/{id}")
    public String displayCharacterDetails(@PathVariable String id, ModelMap modelMap) {
        int characterId = Integer.parseInt(id);
        StarWarsCharacter character = characterRepository.getCharactersInFilm(2).get(characterId);
        modelMap.put("character", character);
        return "character-details";
    }

}
