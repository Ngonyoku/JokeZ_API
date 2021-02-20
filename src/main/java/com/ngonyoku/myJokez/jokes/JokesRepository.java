package com.ngonyoku.myJokez.jokes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
 * This Interface is responsible for data access
 **/
@Repository
public interface JokesRepository extends JpaRepository<Jokes, Long> {

}
