package br.ufc.quixada.cursoIfactory.publisher;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.ufc.quixada.cursoIfactory.pub.Pub;

@Entity
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	@OneToMany(mappedBy = "publishers")
	private Collection<Pub> pubs;
	
	public Publisher() {
		// TODO Auto-generated constructor stub
	}
	
	public Publisher(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
}
