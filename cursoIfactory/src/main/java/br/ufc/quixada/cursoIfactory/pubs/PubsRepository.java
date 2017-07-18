package br.ufc.quixada.cursoIfactory.pubs;

public interface PubsRepository {
	
	Iterable<Pubs> findAll();
	
	void save(Pubs pubs);
	
	void delete(Integer idPubs);
	
	void update(Integer idPubs, Pubs pubs);

}
