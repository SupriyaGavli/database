package io.course.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="test", schema="public")
public class Test {
	
	@Id
	private long id;
	@Column(name="name")
	private String name;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public Test(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}
	
	public Test() {
		super();
		
	}
	
	

}
