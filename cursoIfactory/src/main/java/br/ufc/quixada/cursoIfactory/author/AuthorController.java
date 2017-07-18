package br.ufc.quixada.cursoIfactory.author;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAuthor(@PathVariable("id") Integer idAuthor) throws MalformedURLException, URISyntaxException{
		repository.delete(idAuthor);
		URL createdURL = new URL("http://localhost:8080/authors");
		return ResponseEntity.created(createdURL.toURI()).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> putAuthor(@PathVariable("id")Integer idAuthor, @RequestBody Author author) throws MalformedURLException, URISyntaxException{
		repository.put(idAuthor, author);
		URL createdURL = new URL("http://localhost:8080/authors");
		return ResponseEntity.created(createdURL.toURI()).build();
	}
}
