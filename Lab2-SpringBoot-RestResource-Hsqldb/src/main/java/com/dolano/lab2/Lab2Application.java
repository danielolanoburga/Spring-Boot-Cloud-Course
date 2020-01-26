package com.dolano.lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dolano.lab2.model.Player;
import com.dolano.lab2.model.Team;
import com.dolano.lab2.repository.TeamRepository;

/**
 * @author dolano
 *
 */
@SpringBootApplication
public class Lab2Application {

	@Autowired
	TeamRepository teamRepository;

	/**
	 * Init values of teams list
	 */
	@PostConstruct
	public void init() {

		// Create team A
		Team teamA = new Team();
		teamA.setName("FC Barcelona");
		teamA.setLocation("Barcelona");

		// Create players of team A
		Player playerA1 = new Player("Lionel Messi", "Forward");
		Player playerA2 = new Player("Andres Iniesta", "Midfielder");
		Set<Player> playersA = new HashSet<Player>();
		playersA.add(playerA1);
		playersA.add(playerA2);
		teamA.setPlayers(playersA);

		// Create team B
		Team teamB = new Team();
		teamB.setName("Real Madrid");
		teamB.setLocation("Madrid");

		// Create players of team B
		Player playerB1 = new Player("Lionel Messi", "Forward");
		Player playerB2 = new Player("Andres Iniesta", "Midfielder");
		Set<Player> playersB = new HashSet<Player>();
		playersB.add(playerB1);
		playersB.add(playerB2);
		teamB.setPlayers(playersB);

		// Save teams
		List<Team> teams = new ArrayList<>();
		teams.add(teamA);
		teams.add(teamB);
		teamRepository.saveAll(teams);

	}

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
	}

}
