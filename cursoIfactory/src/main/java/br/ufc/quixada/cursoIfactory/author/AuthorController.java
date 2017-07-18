package br.ufc.quixada.cursoIfactory.author;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	
	@Autowired
	private AuthorRepository repository;

	@GetMapping
	public ResponseEntity<Iterable<Author>> queryAllAuthors(){
		return ResponseEntity.ok(repository.findAll());
	} 
	
	@PostMapping
	public ResponseEntity<Void> createAuthor(@RequestBody Author author) throws MalformedURLException, URISyntaxException{
		repository.save(author);
		URL createdURL = new URL("http://localhost:8080/authors" + author.getId().toString());
		return ResponseEntity.created(createdURL.toURI()).build();
	}
	
	@DeleteMapping
	public void deleteAuthor(@RequestBody Integer idAuthor){
		repository.delete(idAuthor);
	}
}
