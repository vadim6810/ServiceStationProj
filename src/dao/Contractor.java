package src.dao;

import javax.persistence.*;

@Entity
@Table(name="contr")

public class Contractor {

	@Id
	@Column(name="contrId")
	@GeneratedValue
	private int id;
	
	@Column(name="contrName")
	private String name;
	
	@Column(name="contrEmail")
	private String email;
	
	public Contractor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Contractor() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Contractor [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
