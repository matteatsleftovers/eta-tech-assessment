package com.detroitlabs.etatechassessment.controller;

import com.detroitlabs.etatechassessment.model.StarWarsCharacter;
import com.detroitlabs.etatechassessment.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CharacterController {

    @Autowired
    private StarWarsService starWarsService;

    @RequestMapping(value = "/")
    public String displayCharacters(ModelMap modelMap) {
        List<String> characterUrls = starWarsService.fetchFilm(2).getCharacterUrls();
        List<StarWarsCharacter> characters = new ArrayList<>();
        for (String characterUrl: characterUrls) {
            StarWarsCharacter character = starWarsService.fetchCharacter(characterUrl);
            characters.add(character);
        }
        modelMap.put("characters", characters);
        return "home";
    }

}
