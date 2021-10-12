package com.patricia.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patricia.languages.models.Lang;



@Repository
public interface LangRepository extends CrudRepository <Lang, Long>{
	List<Lang> findall(); //SELECT * FROM lang
}
