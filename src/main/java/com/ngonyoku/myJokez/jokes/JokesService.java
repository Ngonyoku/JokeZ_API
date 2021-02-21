package com.ngonyoku.myJokez.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
