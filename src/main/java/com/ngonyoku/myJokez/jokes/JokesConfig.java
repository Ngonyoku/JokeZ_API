package com.ngonyoku.myJokez.jokes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class JokesConfig {

    @Bean
    CommandLineRunner commandLineRunner(JokesRepository repository) {
        return args -> {
            List<Jokes> jokes = new ArrayList<>();

            jokes.add(new Jokes(
                            "An exercise for people who are out of shape: Begin with a five-pound potato bag" +
                                    " in each hand. Extend your arms straight out from your sides, hold them " +
                                    "there for a full minute, and then relax. After a few weeks, move up to " +
                                    "ten-pound potato bags. Then try 50-pound potato bags, and eventually try to get" +
                                    " to where you can lift a 100-pound potato bag in each hand and hold your arms" +
                                    " straight for more than a full minute. Once you feel confident at that level, " +
                                    "put a potato in each bag.",
                            new Timestamp(System.currentTimeMillis())
                    )
            );

            repository.saveAll(jokes);
        };
    }
}
