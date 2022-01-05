package com.patricia.TvShows.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patricia.TvShows.Models.Show;

@Repository
public interface ShowRepository extends CrudRepository <Show, Long> {
	List<Show> findAll();
	List<Show> findByUser_id(Long id);
}
