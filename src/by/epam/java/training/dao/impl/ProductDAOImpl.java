package by.epam.java.training.dao.impl;

import by.epam.java.training.dao.ProductDAO;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;

public class ProductDAOImpl implements ProductDAO{
	
	private final String fileName = "appliances_db.txt";
	
	@Override
	public <E> Product find(Criteria<E> criteria) {
		
		
	}

}
