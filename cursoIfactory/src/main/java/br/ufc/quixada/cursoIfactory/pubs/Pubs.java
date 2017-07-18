package br.ufc.quixada.cursoIfactory.pubs;

import java.util.Date;

import br.ufc.quixada.cursoIfactory.author.Author;

public class Pubs {
	
	private Integer id;
	private Author author;
	private Date data;
	private String nome;	
	
	public Pubs() {
		// TODO Auto-generated constructor stub
	}
	
	public Pubs(Integer id, Author author, Date data, String nome) {
		super();
		this.id = id;
		this.author = author;
		this.data = data;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
