package br.ufc.quixada.cursoIfactory.pubs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PubsRepositoryImpl implements PubsRepository{
	
	private static final List<Pubs> PUBS = new ArrayList<>();
	
	public Iterable<Pubs> findAll(){
		return PUBS;
	}
	
	public void save(Pubs pubs){
		
	}
	
	public void delete(Integer idPubs){
		
	}
	
	public void update(Integer idPubs, Pubs pubs){
		
	}
}
