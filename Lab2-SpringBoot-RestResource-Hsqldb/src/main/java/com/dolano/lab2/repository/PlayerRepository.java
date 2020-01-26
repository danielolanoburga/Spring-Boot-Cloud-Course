package com.dolano.lab2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dolano.lab2.model.Player;

@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
