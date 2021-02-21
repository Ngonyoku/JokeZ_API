package com.ngonyoku.myJokez.jokes;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;


/*
 * This Class is responsible for handling Business Logic
 * */
@Service
public class JokesService {

    private final JokesRepository jokesRepository;

    public JokesService(JokesRepository jokesRepository) {
        this.jokesRepository = jokesRepository;
    }

    public List<Jokes> getJokes() {
        return jokesRepository.findAll();//Return all the Jokes
    }

    public void postNewJoke(Jokes joke) {
        joke.setDateCreated(new Timestamp(System.currentTimeMillis()));
        jokesRepository.save(joke);
    }
}
