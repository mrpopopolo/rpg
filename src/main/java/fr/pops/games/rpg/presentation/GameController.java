package fr.pops.games.rpg.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.pops.games.rpg.business.entity.Player;
import fr.pops.games.rpg.business.service.PlayerService;

@Controller
public class GameController {

	@Autowired
	private PlayerService playServ;
	
	@GetMapping({"/index", "/"})
	public String index() {
		return "index.html";
	}
	
	@PostMapping("/main")
	public String game(Model model, @RequestParam String name) {
		Player play = playServ.createOrLoadPlayer(name);
		model.addAttribute("player", play);
		return "game.html";
	}
}