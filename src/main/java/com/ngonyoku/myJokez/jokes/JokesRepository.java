package com.ngonyoku.myJokez.jokes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * The Repository is responsible for performing  CRUD Operations.
 * This interface interacts with the datasource i.e the Database
 **/
@Repository
public interface JokesRepository extends JpaRepository<Jokes, Long> {

}
