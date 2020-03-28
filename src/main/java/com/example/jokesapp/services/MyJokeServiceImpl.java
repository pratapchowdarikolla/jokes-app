package com.example.jokesapp.services;

import org.springframework.stereotype.Service;

@Service
public class MyJokeServiceImpl implements JokeService {
    @Override
    public String getJoke() {
        return "This is my Joke!";
    }
}
