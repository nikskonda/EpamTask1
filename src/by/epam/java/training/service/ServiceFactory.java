package by.epam.java.training.service;

import by.epam.java.training.entity.Product;
import by.epam.java.training.service.impl.ProductServiceImpl;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class ServiceFactory {
	
	private static ServiceFactory instance = new ServiceFactory();
	private static Lock lock = new ReentrantLock();
	
	private final ProductService productService = new ProductServiceImpl();
	
	private ServiceFactory() {}

	public ProductService getProductService() {
		return productService;
	}
	
	public static ServiceFactory getInstance() {
        try {
            lock.lock();
            if (instance == null){
                instance = new ServiceFactory();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock(); 
        }
        return instance;     
    } 
}
