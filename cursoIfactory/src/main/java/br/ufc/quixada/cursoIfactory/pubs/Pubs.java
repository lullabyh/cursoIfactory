package br.ufc.quixada.cursoIfactory.pubs;

import java.util.Date;

import br.ufc.quixada.cursoIfactory.author.Author;
import br.ufc.quixada.cursoIfactory.publishers.Publishers;

public class Pubs {
	
	private Integer id;
	private Author author;
	private Date data;
	private String descrição;
	private String Tipo;
	private Publishers publishers;
	
	public Pubs() {
		// TODO Auto-generated constructor stub
	}
	
	public Pubs(Integer id, Author author, Date data, String nome) {
		super();
		this.id = id;
		this.author = author;
		this.data = data;
		this.descrição = nome;
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
		return descrição;
	}
	public void setNome(String nome) {
		this.descrição = nome;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public Publishers getPublishers() {
		return publishers;
	}
	public void setPublishers(Publishers publishers) {
		this.publishers = publishers;
	}
}
