package com.ngonyoku.myJokez.jokes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JokesConfig {

    @Bean
    CommandLineRunner commandLineRunner(JokesRepository repository) {
        return args -> {
            List<Jokes> jokes = new ArrayList<>();

            jokes.add(new Jokes( "Knock Knock", ""));
            jokes.add(new Jokes( "Knock Knock", ""));

            repository.saveAll(jokes);
        };
    }
}
