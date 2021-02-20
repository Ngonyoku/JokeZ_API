package com.ngonyoku.myJokez;

import com.ngonyoku.myJokez.jokes.Jokes;
import com.ngonyoku.myJokez.jokes.JokesRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyJokezApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyJokezApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(JokesRepository jokesRepository) {
        return args -> {
            jokesRepository.save(new Jokes(1L, "What do we call a vampire from Kisumu? Ouma", "2021-10-05"));
            jokesRepository.save(new Jokes(2L, "What do we call a vampire from Kisumu? Ouma", "2021-10-05"));
        };
    }
}
