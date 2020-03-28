package com.example.jokesapp.controllers;

import com.example.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private JokeService jokeService;

    public JokesController(@Qualifier("chuckNorrisJokeServiceImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJokes(Model jokesModel) {
        jokesModel.addAttribute("joke" , this.jokeService.getJoke());
        return "chucknorris";
    }
}
