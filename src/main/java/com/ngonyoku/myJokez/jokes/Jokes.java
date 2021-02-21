package com.ngonyoku.myJokez.jokes;

import javax.persistence.*;

/*
 * This class is a model of Our table
 **/
@Entity
@Table
public class Jokes {

    @Id
    @SequenceGenerator(name = "jokes_generator", sequenceName = "jokes_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jokes_generator")
    private Long id;

    @Column
    private String joke;

    @Column
    private String dateCreated;

    public Jokes(Long id, String joke, String dateCreated) {
        this.id = id;
        this.joke = joke;
        this.dateCreated = dateCreated;
    }

    public Jokes(String joke, String dateCreated) {
        this.joke = joke;
        this.dateCreated = dateCreated;
    }

    public Jokes() {
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

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
