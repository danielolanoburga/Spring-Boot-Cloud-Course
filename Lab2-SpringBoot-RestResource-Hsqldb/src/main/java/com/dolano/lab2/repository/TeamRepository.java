package com.dolano.lab2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dolano.lab2.model.Team;

@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long>{

}
