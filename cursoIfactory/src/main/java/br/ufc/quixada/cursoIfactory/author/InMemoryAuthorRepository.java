package br.ufc.quixada.cursoIfactory.author;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InMemoryAuthorRepository implements AuthorRepository{
	
	private static final List<Author> AUTHORS = new ArrayList<>();
	
	static{
		AUTHORS.addAll(Arrays.asList( new Author(1, "Mariana","Silva Santos"),
										new Author(2, "Darliane","Silva") ));
	}
	
	public Iterable<Author> findAll(){
		return Collections.unmodifiableList(AUTHORS);
	}
	
	public void save(Author author){
		AUTHORS.add(author);
	}
	
	public void delete(Integer idAuthor){
		//o idAuthor significa o index do author nesse caso
		for (Author author : AUTHORS) {
			if(author.getId().equals(idAuthor)){
				AUTHORS.remove(author.getId());
			}
		}
	}
}
