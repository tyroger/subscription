package com.rtprojects.subscription.models;

/**
 * this class refers to a subscription.
 * Used to create a new subscription or to manage an existing one
 * @author tyroger
 *
 */
public class Subscription {
	
	/*Attributes*/
	
	private Integer id;
	private String designation;
	private float price;
	private Category category;
	private Supplier supplier;
	private ContractDuration contractDuration;
	private PaymentFrequency paymentFrequency;
	
	
	/*constructors*/
	
	/**
	 * used at any time, when need to manage a subscription
	 */
	public Subscription()
	{
		super();
	}
	
	
	/**
	 * used to manage a new subscription
	 * @param designation
	 * @param price
	 * @param category
	 * @param supplier
	 * @param contractDuration
	 * @param paymentFrequency
	 */
	public Subscription(String designation, float price, Category category, Supplier supplier, ContractDuration contractDuration,PaymentFrequency paymentFrequency)
	{
		super();
		this.id = -1; 
		setDesignation(designation);
		setPrice(price);
		setCategory(category);
		setSupplier(supplier);
		setContractDuration(contractDuration);
		setPaymentFrequency(paymentFrequency);	
	}
	
	/**
	 * used to manage an existing subscription
	 * @param id
	 * @param designation
	 * @param price
	 * @param category
	 * @param supplier
	 * @param contractDuration
	 * @param paymentFrequency
	 */
	public Subscription(Integer id, String designation, float price, Category category, Supplier supplier, ContractDuration contractDuration,PaymentFrequency paymentFrequency)
	{
		super();
		setId(id);
		setDesignation(designation);
		setPrice(price);
		setCategory(category);
		setSupplier(supplier);
		setContractDuration(contractDuration);
		setPaymentFrequency(paymentFrequency);
	}

	
	/*getter and setter*/

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public ContractDuration getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(ContractDuration contractDuration) {
		this.contractDuration = contractDuration;
	}

	public PaymentFrequency getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	/*methods*/
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subscription [id=");
		builder.append(id);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", price=");
		builder.append(price);
		builder.append(", category=");
		builder.append(category);
		builder.append(", supplier=");
		builder.append(supplier);
		builder.append(", contractDuration=");
		builder.append(contractDuration);
		builder.append(", paymentFrequency=");
		builder.append(paymentFrequency);
		builder.append("]");
		return builder.toString();
	}
}
