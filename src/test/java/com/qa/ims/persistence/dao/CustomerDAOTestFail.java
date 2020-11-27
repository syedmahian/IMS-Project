package com.qa.ims.persistence.dao;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.DBUtils;

public class CustomerDAOTestFail {

	private CustomerDAO customerDAO = new CustomerDAO();
	

	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "fail");
	}
	
	@Before
	public void setup() {
			DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql"); //
		}
	
	@Test
	public void testCreate() {
		final Customer created = new Customer(2L, "chris", "perrins");
		
		assertEquals(created, customerDAO.create(created));
	}
	
	
	@Test
	public void testReadLatest() {
		assertEquals(new Customer(1L, 'jordan','harrison'), customerDAO.readLatest());
	}
	
	@Test
	public void testReadAll() {
		assertEquals(new ArrayList<>(), customerDAO.readAll());
	}
	
	@Test
	public void testRead() {
		final long ID = 1L;
		assertEquals(new Customer(ID, 'jordan', 'harrison'), customerDAO.readCustomer(ID));
	}
	
	@Test
	public void testUpdate() {
		final Customer updated = new Customer(1L, "chris", "perrins");
		assertEquals(updated, customerDAO.update(updated));

	}
}
