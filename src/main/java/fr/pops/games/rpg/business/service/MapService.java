package fr.pops.games.rpg.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pops.games.rpg.business.entity.Map;
import fr.pops.games.rpg.persistence.MapRepository;

@Service
public class MapService {

	@Autowired
	private MapRepository mapRep;
	
	public void saveMap(String mapDesign) {
		Map map = new Map();
		map.setMap(mapDesign);
		this.mapRep.save(map);
	}
}
