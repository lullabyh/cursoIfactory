package br.ufc.quixada.cursoIfactory.pubs;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.ufc.quixada.cursoIfactory.author.Author;
import br.ufc.quixada.cursoIfactory.publishers.Publisher;

@Entity
public class Pub {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	private Author author;

	@Temporal(TemporalType.DATE)
	private Date data;

	private String titulo;

	private String Tipo;
	
	@ManyToOne
	private Publisher publishers;

	public Pub(Integer id, Author author, Date data, String titulo, String tipo, Publisher publishers) {
		super();
		this.id = id;
		this.author = author;
		this.data = data;
		this.titulo = titulo;
		Tipo = tipo;
		this.publishers = publishers;
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
		return titulo;
	}

	public void setNome(String nome) {
		this.titulo = nome;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Publisher getPublishers() {
		return publishers;
	}

	public void setPublishers(Publisher publishers) {
		this.publishers = publishers;
	}
}
