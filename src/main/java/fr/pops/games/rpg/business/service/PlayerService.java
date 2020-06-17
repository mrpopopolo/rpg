package fr.pops.games.rpg.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pops.games.rpg.business.entity.Player;
import fr.pops.games.rpg.persistence.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRep;
	
	public Player createOrLoadPlayer(String name) {
		Player play = this.playerRep.findOneByName(name);
		if(play != null) {
			return play;
		}
		
		play = new Player(name);
		this.playerRep.save(play);
		return play;
	}
}
