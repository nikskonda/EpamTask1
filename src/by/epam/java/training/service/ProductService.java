package by.epam.java.training.service;

		import by.epam.java.training.entity.Product;
		import by.epam.java.training.entity.criteria.Criteria;
		import java.util.List;


public interface ProductService {

	<E> List<Product> find(Criteria<E> criteria);

}