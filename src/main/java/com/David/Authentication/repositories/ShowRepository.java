package com.David.Authentication.repositories;

import com.David.Authentication.models.Show;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

@Repository
public interface ShowRepository extends CrudRepository<Show, Long> {
    List<Show> findAll();

    Show findByTitle(String title);

    @Query("Select s FROM Show s ORDER BY s.average ASC")
    List<Show> getByRating();
}
