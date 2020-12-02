package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	//Attributes 
	
	private Long orderId;
	private Long customerId; 
	private List<Item> itemId = new ArrayList<>();
	private Long itemPrice;
	

	
	// Constructors
	
	public Order(Long customerId) {
		super();
		this.customerId = customerId;
	}
	
	
	public Order(Long orderId, Long customerId) {
		super();
		this.orderId = orderId;
		this.customerId= customerId;
	}
	
	public Order(Long orderId, Long customerId, List<Item> itemId) {
		
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.setItemId(itemId);
		
	}
	
	public Order(Long orderId, Long customerId, List<Item> itemId, Long itemPrice) {
		
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.setItemId(itemId);
		this.setItemPrice(itemPrice);
	}

	//Getters and setters
	
	public Long getOrderId() {
		return orderId;
	}

	public void setId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public List<Item> getItemId() {
		return itemId;
	}

	public void setItemId(List<Item> itemId) {
		this.itemId = itemId;
	}

	public Long getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

	// Methods 

	@Override
	public String toString() {
		return "Order id:" + orderId + " Customer id:" + customerId + "Item" + itemId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Order other = (Order) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		
		if (itemPrice == null) {
			if (other.itemPrice != null)
				return false;
		} else if (!itemPrice.equals(other.itemPrice))
			return false;
		
		if ( itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		
		return true;
	}

	
	
}


