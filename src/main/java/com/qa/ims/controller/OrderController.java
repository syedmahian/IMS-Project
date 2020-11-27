package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;



public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private ItemDAO itemDAO;
	private CustomerDAO customerDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, ItemDAO itemDAO, CustomerDAO customerDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.itemDAO = itemDAO;
		this.customerDAO = customerDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Order create() {
		LOGGER.info("Please enter customer ID");
		Long customerId = utils.getLong();
		Order order = orderDAO.create(new Order(customerId));
		String answer;
		do {
			LOGGER.info("Please enter a customer ID");
			Long customer_Id = utils.getLong();
			orderDAO.createItem(order.getOrderId(), order.getItemId());
			LOGGER.info("Add more items to order?");
			answer = utils.getString();
		} while(answer.toLowerCase().equals("yes"));
		LOGGER.info("Order created");
		order = orderDAO.readLatest();
		return order;
			

		// LOGGER.info("Please enter a customer ID");
		// Long customerId = utils.getLong();
		Order order1 = orderDAO.create(new Order(order.getOrderId(), customerId));
		LOGGER.info("Order created");
		return order;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter a customer id");
		Long customerId = utils.getLong();
		
		Order order = orderDAO.update(new Order(orderId, customerId));
		LOGGER.info("Order Updated");
		return order;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the order id of the order you would like to delete");
		Long orderId = utils.getLong();
		return orderDAO.delete(orderId);
	}


}
