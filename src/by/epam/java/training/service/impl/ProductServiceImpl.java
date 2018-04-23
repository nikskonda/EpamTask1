package by.epam.java.training.service.impl;

import by.epam.java.training.dao.DAOFactory;
import by.epam.java.training.dao.ProductDAO;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.service.ProductService;
import by.epam.java.training.service.validation.Validator;

public class ProductServiceImpl implements ProductService{

	@Override
	public <E> Product find(Criteria<E> criteria) {
		
		if (!Validator.isValidCriteria(criteria) ) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ProductDAO productDAO = factory.getProductDAO();
		
		Product product= productDAO.find(criteria);
					
		return product;

	}
	
}
