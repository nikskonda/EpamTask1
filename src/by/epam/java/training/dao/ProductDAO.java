package by.epam.java.training.dao;

import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;

import java.util.List;

public interface ProductDAO {
	<E> List<Product> find(Criteria<E> criteria);
}
