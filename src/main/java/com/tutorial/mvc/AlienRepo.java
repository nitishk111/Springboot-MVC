package com.tutorial.mvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	public List<Alien> findByaName(String aName); //Query DSL
	
	@Query("from Alien where aName= :name")
	List<Alien> khojo(@Param("name") String aName);



}
