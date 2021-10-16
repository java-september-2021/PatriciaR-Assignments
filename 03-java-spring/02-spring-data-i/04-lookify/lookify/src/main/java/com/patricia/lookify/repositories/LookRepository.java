package com.patricia.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patricia.lookify.models.Look;

@Repository
public interface LookRepository extends CrudRepository<Look, Long> {
	List<Look> findAll();
	// this method finds Artists with descriptions containing the search string
    List<Look> findByArtistContaining(String search);
   //order descending and top ten records
    List<Look> findTop10ByOrderByRatingDesc();
}
