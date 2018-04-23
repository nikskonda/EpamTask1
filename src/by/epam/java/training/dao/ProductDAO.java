package by.epam.java.training.dao;

import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;

public interface ProductDAO {
	<E> Product find(Criteria<E> criteria);
}
