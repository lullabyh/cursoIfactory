package br.ufc.quixada.cursoIfactory.publishers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.ufc.quixada.cursoIfactory.pubs.Pub;

@Entity
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	private Pub pubs;
	
	public Publisher() {
		// TODO Auto-generated constructor stub
	}
	
	public Publisher(Integer id, String nome, Pub pubs) {
		super();
		this.id = id;
		this.nome = nome;
		this.pubs = pubs;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pub getPubs() {
		return pubs;
	}
	public void setPubs(Pub pubs) {
		this.pubs = pubs;
	}
	
}
