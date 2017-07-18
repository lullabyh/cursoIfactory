package br.ufc.quixada.cursoIfactory.author;

public interface AuthorRepository {
	
	Iterable<Author> findAll();
	
	void save(Author author);
	
	void delete(Integer idAuthor);

}
