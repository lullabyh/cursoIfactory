package br.ufc.quixada.cursoIfactory.publishers;

import br.ufc.quixada.cursoIfactory.pubs.Pubs;

public class Publishers {
	
	private Integer id;
	private String nome;
	private Pubs pubs;
	
	public Publishers() {
		// TODO Auto-generated constructor stub
	}
	
	public Publishers(Integer id, String nome, Pubs pubs) {
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
	public Pubs getPubs() {
		return pubs;
	}
	public void setPubs(Pubs pubs) {
		this.pubs = pubs;
	}
	
}
