package br.ufc.quixada.cursoIfactory.author;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

//Classe de teste para a primeira atividade sem JPA
@Component
public class InMemoryAuthorRepository{
	
	private static final List<Author> AUTHORS = new ArrayList<>();
	
//	static{
//		AUTHORS.addAll(Arrays.asList( new Author(1, "Mariana","Silva Santos"),
//										new Author(2, "Darliane","Silva") ));
//	}
	
	public Iterable<Author> findAll(){
		return Collections.unmodifiableList(AUTHORS);
	}
	
	public void salvar(Author author){
		AUTHORS.add(author);
	}
	
	public void delete(Integer idAuthor){
		for(Iterator<Author> it = AUTHORS.iterator(); it.hasNext(); ){
			Author author = it.next();
			if(author.getId().equals(idAuthor)){
				AUTHORS.remove(author);
			}
		}
	}
	
	public void put(Integer idAuthor, Author author){
		for(Iterator<Author> it = AUTHORS.iterator(); it.hasNext(); ){
			Author a = it.next();
			if(a.getId().equals(idAuthor)){
				a.setFirstName(author.getFirstName());
				a.setLastName(author.getLastName());
			}
		}
	}
}
