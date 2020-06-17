package fr.pops.games.rpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "fr.pops.games.rpg.business.entity",
				 "fr.pops.games.rpg.business.service",
				 "fr.pops.games.rpg.persistence",
				 "fr.pops.games.rpg.presentation"
				})
public class RpgApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgApplication.class, args);
	}

}
