package com.detroitlabs.etatechassessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CharacterController {

    @RequestMapping(value = "/")
    public String displayCharacters() {
        return "home";
    }

}
