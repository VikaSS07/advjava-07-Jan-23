package xyz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp123")
public class Employee {
	@Id
	@Column(name = "empid")
	private int id;
	@Column(length = 30, nullable = false)
	private String name;
	@Column(unique = true)
	private String email;
	@Column(length = 10, name = "phoneno", unique = true, nullable = false)
	private String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
