package com.ngonyoku.myJokez.jokez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/jokes")
public class JokezController {

    @GetMapping
    public List<Jokez> getJokez() {
        return List.of(new Jokez(1L,
                        "What do we call a vampire from Kisumu?\n\n OUMA! ",
                        LocalDate.of(2021, Month.FEBRUARY, 20)
                )
        );
    }
}
