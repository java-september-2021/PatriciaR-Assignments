package com.patricia.drivers.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patricia.drivers.models.lic;

@Repository
public interface licRepository extends CrudRepository<lic, Long>{
	List<lic> findAll();
}
