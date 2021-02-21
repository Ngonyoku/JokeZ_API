package com.ngonyoku.myJokez.jokes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokesRepository extends JpaRepository<Jokes, Long> {

}
