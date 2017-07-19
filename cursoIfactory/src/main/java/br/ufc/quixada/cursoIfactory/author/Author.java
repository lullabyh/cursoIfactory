package br.ufc.quixada.cursoIfactory.author;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.ufc.quixada.cursoIfactory.pub.Pub;

@Entity
public class Author {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	@OneToMany(mappedBy = "author")
	private Collection<Pub> pubs;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}
