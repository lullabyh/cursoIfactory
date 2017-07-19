package br.ufc.quixada.cursoIfactory.pub;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PubRepositoryImpl implements PubRepository{
	
	private static final List<Pub> PUBS = new ArrayList<>();
	
	public Iterable<Pub> findAll(){
		return PUBS;
	}
	
	public void save(Pub pubs){
		
	}
	
	public void delete(Integer idPubs){
		
	}
	
	public void update(Integer idPubs, Pub pubs){
		
	}
}
