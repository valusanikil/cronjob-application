package org.example.ws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="greeting")
public class Greeting {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="texts")
	private String texts;

	public Greeting() {

	}
	
	public Greeting(String texts) {
		this.texts=texts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexts() {
		return texts;
	}

	public void setTexts(String texts) {
		this.texts = texts;
	}

}
