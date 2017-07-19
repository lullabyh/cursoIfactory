package br.ufc.quixada.cursoIfactory.pub;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.ufc.quixada.cursoIfactory.author.Author;
import br.ufc.quixada.cursoIfactory.publisher.Publisher;


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
	
	@Enumerated(EnumType.STRING)
	private TypePub tipo;
	
	@ManyToOne
	private Publisher publisher;

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

	public TypePub getTipo() {
		return tipo;
	}

	public void setTipo(TypePub tipo) {
		this.tipo = tipo;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
}
