package by.epam.java.training.dao.constructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import by.epam.java.training.dao.constructor.impl.ProductConstructorImpl;

public class CounstuctorFactory {
	private static CounstuctorFactory instance = new CounstuctorFactory();
	private static Lock lock = new ReentrantLock();
	
	private final ProductConstructor productConstructor = new ProductConstructorImpl();
	
	private CounstuctorFactory() {}

	public ProductConstructor getProductConstructor() {
		return productConstructor;
	}
	
	public static CounstuctorFactory getInstance() {
        try {
            lock.lock();
            if (instance == null){
                instance = new CounstuctorFactory();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock(); 
        }
        return instance;     
    } 
}
