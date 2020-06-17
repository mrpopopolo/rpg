package fr.pops.games.rpg.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.pops.games.rpg.business.service.MapService;

@Controller
public class EditController {

	@Autowired
	private MapService mapServ;
	
	@GetMapping("/mapEditor")
	public String mapEditor() {
		return "mapEditor.html";
	}
	
	@PostMapping("/mapEditor")
	public String saveMap(@RequestParam String mapDesign) {
		this.mapServ.saveMap(mapDesign);
		return "index.html";
	}
}
