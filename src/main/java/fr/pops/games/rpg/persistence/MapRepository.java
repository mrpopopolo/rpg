package fr.pops.games.rpg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.pops.games.rpg.business.entity.Map;

@Repository
public interface MapRepository extends JpaRepository<Map, Integer> {

}
