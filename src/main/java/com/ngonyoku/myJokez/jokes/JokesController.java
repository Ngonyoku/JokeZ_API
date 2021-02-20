package com.ngonyoku.myJokez.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/*
 * This class acts as the API Layer
 * */
@RestController
@RequestMapping(path = "api/jokes")
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping
    public List<Jokes> getJokes() {
        return jokesService.getJokes();
    }
}
