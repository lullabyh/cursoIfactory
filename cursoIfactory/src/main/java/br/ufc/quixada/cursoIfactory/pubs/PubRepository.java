package br.ufc.quixada.cursoIfactory.pubs;

public interface PubRepository {
	
	Iterable<Pub> findAll();
	
	void save(Pub pubs);
	
	void delete(Integer idPubs);
	
	void update(Integer idPubs, Pub pubs);

}
