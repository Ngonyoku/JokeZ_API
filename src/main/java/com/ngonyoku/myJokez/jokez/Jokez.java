package com.ngonyoku.myJokez.jokez;

import java.time.LocalDate;

public class Jokez {
    private Long id;
    private String joke;
    private LocalDate dateCreated;

    public Jokez(Long id, String joke, LocalDate dateCreated) {
        this.id = id;
        this.joke = joke;
        this.dateCreated = dateCreated;
    }

    public Jokez(String joke, LocalDate dateCreated) {
        this.joke = joke;
        this.dateCreated = dateCreated;
    }

    public Jokez() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
