package com.patricia.TvShows.Repositories;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.patricia.TvShows.Models.User;

@Repository
public interface UserRepository extends CrudRepository <User,Long>{
	User findByEmail(String email);
	
	
}
