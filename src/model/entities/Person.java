package model.entities;

import java.io.Serializable;

public class Person implements Serializable {
	private Integer Id;
	private String name;
	private String email;

	public Person() {

	}

	public Person(Integer id, String name, String email) {
		Id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", email=" + email + "]";
	}
}
