package com.rtprojects.subscription.models;

/**
 * this class refers an owner who get a subscription.
 *  Used to create a new owner or to manage an existing one
 * @author tyroger
 *
 */
public class Owner {

	private Integer id;
	private String firstname;
	private String password;
	private String email;

	/*constructors*/
	
	/**
	 * to be used at ant time
	 */
	public Owner() {
		super();
	}


	/**
	 * to be used for owner connection
	 * @param password
	 * @param email
	 */
	public Owner(String password, String email) {
		super();
	}


	/**
	 * to be used for registration
	 * @param firstname
	 * @param password
	 * @param email
	 */
	public Owner(String firstname, String password, String email) {
		super();
	}


	/**
	 * to be used for Owner management
	 * @param id
	 * @param firstname
	 * @param password
	 * @param email
	 */
	public Owner(Integer id, String firstname, String password, String email) {
		super();
	}

	/*setter and getter*/

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	/*Methods*/

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [id=");
		builder.append(id);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}


}
