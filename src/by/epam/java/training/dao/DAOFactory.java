package by.epam.java.training.dao;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.service.ServiceFactory;

public class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
	private static Lock lock = new ReentrantLock();

	private final ProductDAO productDAO = new ProductDAOImpl();
	
	private DAOFactory() {}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public static DAOFactory getInstance() {
        try {
            lock.lock();
            if (instance == null){
                instance = new DAOFactory();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock(); 
        }
        return instance;     
    } 

}
