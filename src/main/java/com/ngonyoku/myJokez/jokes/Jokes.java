package com.ngonyoku.myJokez.jokes;

import javax.persistence.*;
import java.util.Date;


/*
 * This class is a model of Our table
 * I am using PostgreSQL for this
 *
    create table jokes (
       id  bigserial not null,
        date_created timestamp not null,
        date_updated timestamp,
        joke TEXT not null,
        primary key (id)
    )
    *
 **/
@Entity
@Table
public class Jokes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String joke;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dateUpdated;

    public Jokes(Long id, String joke, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.joke = joke;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Jokes(String joke, Date dateCreated, Date dateUpdated) {
        this.joke = joke;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Jokes(String joke, Date dateCreated) {
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Jokes{" +
                "id=" + id +
                ", joke='" + joke + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
