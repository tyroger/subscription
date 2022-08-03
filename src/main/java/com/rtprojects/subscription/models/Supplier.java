package com.rtprojects.subscription.models;

/**
 * this class defines the supplier who delivers a subscription.
 * it is used to create a new supplier or to manager an existing one.
 * @author tyroger
 *
 */

public class Supplier {

	/*Attributes*/
	private Integer id;
	private String name;
	private String email;
	private String website;
	private String phoneNumber;


	/*constructors*/
	public Supplier() {
		super();
	}

	public Supplier(String name, String email, String website, String phoneNumber) {
		super();
		this.id = -1;
		setName(name);
		setEmail(email);
		setWebsite(website);
		setPhoneNumber(phoneNumber);

	}
	public Supplier(Integer id, String name, String email, String website, String phoneNumber) {
		super();
		setId(id);
		setName(name);
		setEmail(email);
		setWebsite(website);
		setPhoneNumber(phoneNumber);
	}


	/*getter & setter*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/*methods*/

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Supplier [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", website=");
		builder.append(website);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append("]");
		return builder.toString();
	}
}
