package com.ngonyoku.myJokez.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //GET Request for all Jokes
    @GetMapping
    public List<Jokes> getJokes() {
        return jokesService.getJokes();
    }

    //POST Request for all Jokes
    @PostMapping
    public void postNewJoke(@RequestBody Jokes joke) {
        jokesService.postNewJoke(joke);
    }

    //DELETE functionality in the API
    @DeleteMapping(path = "{jokeID}")
    public void deleteSingleJoke(@PathVariable Long jokeID) {
        jokesService.deleteSingleJoke(jokeID);
    }
}
