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

    @PutMapping(path = "{jokeId}")
    public void updateSingleJoke(@PathVariable("jokeId") Long jokeID, @RequestParam String joke) {
        jokesService.updateSingleJoke(jokeID, joke);
    }

    //DELETE functionality in the API
    @DeleteMapping(path = "{jokeId}")
    public void deleteSingleJoke(@PathVariable("jokeId") Long jokeID) {
        jokesService.deleteSingleJoke(jokeID);
    }
}
