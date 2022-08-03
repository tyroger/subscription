package com.rtprojects.subscription.models;

public class Category {
	
	private Integer id;
	private String designation;
	
	
	/*constructors*/
	
	public Category() {
		super();
	}
	
	public Category(String designation) {
		super();
		this.id = -1;
		setDesignation(designation);
	}

	public Category(Integer id, String designation) {
		super();
		setId(id);
		setDesignation(designation);
	}
	
	
	
	/*getters & setters*/
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	/*methods*/
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [id=");
		builder.append(id);
		builder.append(", designation=");
		builder.append(designation);
		builder.append("]");
		return builder.toString();
	}
	
	


}
