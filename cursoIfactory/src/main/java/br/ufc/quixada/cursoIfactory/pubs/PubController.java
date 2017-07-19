package br.ufc.quixada.cursoIfactory.pubs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pubs")
public class PubController {
	
	@Autowired
	private PubRepository pubsRepository;
	
	@GetMapping
	public ResponseEntity<Pub> getPubs(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
