package com.qa.ims.persistence.dao;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {
	
	private final ItemDAO itemDAO = new ItemDAO();
	
	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "root");
	}
	
	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "Monster", 2L));
		assertEquals(expected, itemDAO.readAll());
	}

	@Test
	public void testCreate() {
		final Item created = new Item(2L, "Pepsi", 3L);
		assertEquals(created, itemDAO.create(created));
	}
	
	@Test
	public void testReadLatest() {
		assertEquals(new Item(2L, "Pepsi", 3L), itemDAO.readLatest());
	}
	
	@Test
	public void testRead() {
		final long ID = 1L;
		assertEquals(new Item(ID, "Monster", 2L), itemDAO.readItem(ID));
	}
	
	@Test
	public void testUpdate() {
		final Item updated = new Item(2L, "Dr Pepper", 3L);
		assertEquals(updated, itemDAO.update(updated));

	}
	
	@Test
	public void testDelete() {
		assertEquals(1, itemDAO.delete(1));
	}
	
	
}
