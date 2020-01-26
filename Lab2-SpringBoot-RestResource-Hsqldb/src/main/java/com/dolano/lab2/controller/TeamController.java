package com.dolano.lab2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dolano.lab2.model.Team;
import com.dolano.lab2.repository.TeamRepository;

/**
 * @author dolano
 *
 */
//@RestController (We will be using Spring Data REST to implement the controller, so we don't want this existing controller to interfere)
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;

	/**
	 * @return List of teams
	 */
	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
	
	@RequestMapping("/team/{id}")
	public Optional<Team> getTeam(@PathVariable Long id) {
		return teamRepository.findById(id);
	}

}
