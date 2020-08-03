package br.com.mateus.testedetectafraude.model;

public class Transacao {

	private String id;
	private double value;
	private String paidAt;
	private String ipLocation;
	private String cardHoldName;
	private Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(String paidAt) {
		this.paidAt = paidAt;
	}

	public String getIpLocation() {
		return ipLocation;
	}

	public void setIpLocation(String ipLocation) {
		this.ipLocation = ipLocation;
	}

	public String getCardHoldName() {
		return cardHoldName;
	}

	public void setCardHoldName(String cardHoldName) {
		this.cardHoldName = cardHoldName;
	}

}
