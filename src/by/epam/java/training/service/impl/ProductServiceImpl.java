package by.epam.java.training.service.impl;

import by.epam.java.training.dao.DAOFactory;
import by.epam.java.training.dao.ProductDAO;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.service.ProductService;
import by.epam.java.training.service.validation.ValidatorCriteria;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

	@Override
	public <E> List<Product> find(Criteria<E> criteria) {

		List<Product> list = new ArrayList<>();

		ValidatorCriteria validator = new ValidatorCriteria();
		if (!validator.isValidCriteria(criteria) ) {                        
			return null;
		}
                
		DAOFactory factory = DAOFactory.getInstance();
		ProductDAO productDAO = factory.getProductDAO();
		
		list = productDAO.find(criteria);
					
		return list;

	}
	
}
