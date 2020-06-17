package fr.pops.games.rpg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.pops.games.rpg.business.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	Player findOneByName(String name);

}
