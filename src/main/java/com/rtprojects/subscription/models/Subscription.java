package com.rtprojects.subscription.models;

/**
 * this class refers to a subscription.
 * Used to create a new subscription or to manage an existing one
 * @author tyroger
 *
 */
public class Subscription {
	
	private Integer id;
	private String designation;
	private float price;
	private Category category;
	private Supplier supplier;
	private ContractDuration contractDuration;
	private PaymentFrequency paymentFrequency;
	
	

}
