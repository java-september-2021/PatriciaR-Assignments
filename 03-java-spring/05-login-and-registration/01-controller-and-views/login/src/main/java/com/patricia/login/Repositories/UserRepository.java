package com.patricia.login.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patricia.login.Models.User;

@Repository

public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String email);

}
