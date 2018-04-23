package by.epam.java.training.service;

import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;

public interface ProductService {
	
	<E> Product find(Criteria<E> criteria);
	
}