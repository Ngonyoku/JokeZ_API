package com.ngonyoku.myJokez.jokes;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;


/*
 * This Class is responsible for handling Business Logic
 * */
@Service
public class JokesService {

    private final JokesRepository jokesRepository;

    public JokesService(JokesRepository jokesRepository) {
        this.jokesRepository = jokesRepository;
    }

    public List<Jokes> getAllJokes() {
        return jokesRepository.findAll();//Return all the Jokes
    }

    public Optional<Jokes> getSingleJoke(Long jokeId) {
        return jokesRepository.findById(jokeId);
    }

    public void postNewJoke(Jokes joke) {
        joke.setDateCreated(new Timestamp(System.currentTimeMillis()));
        jokesRepository.save(joke);
    }

    public void deleteSingleJoke(Long jokeID) {
        //Ensure that the JokeID Exists, If it does, Delete the Whole Record, else throw an Exception
        if (jokesRepository.existsById(jokeID)) jokesRepository.deleteById(jokeID);
        else throw new IllegalStateException("Joke Does Not Exists");
    }

    @Transactional
    public void updateSingleJoke(Long jokeID, String joke) {
        if (jokeID != null) {
            Jokes jokes = jokesRepository
                    .findById(jokeID)
                    .orElseThrow(() -> new IllegalStateException("Joke does not Exist"));
            if (joke != null && joke.length() > 0 && !joke.equals(jokes.getJoke())) {
                jokes.setJoke(joke);
                jokes.setDateUpdated(new Timestamp(System.currentTimeMillis()));
            }
        }
    }
}
