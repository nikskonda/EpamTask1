package by.epam.java.training.dao.impl;

import by.epam.java.training.dao.ProductDAO;
import by.epam.java.training.dao.constructor.CounstuctorFactory;
import by.epam.java.training.dao.constructor.impl.ProductConstructorImpl;
import by.epam.java.training.dao.impl.util.ProductParser;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductDAOImpl implements ProductDAO{
	
	private final String fileName = "appliances_db.txt";
	
        private ProductParser productParser = new ProductParser();
        
	@Override
	public <E> Product find(Criteria<E> criteria) {		
                Product product = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (isContainsCriterias(criteria, line)){
                            product =  CounstuctorFactory.getInstance()
                            		.getProductConstructor().createProduct(
                            				productParser.parseToCriteria(line));
                        }
                    }            
                } catch (Exception e) {
                    System.out.println(e);
                } finally{
                    return product;
                }
                    
		
	}  

        private <E> boolean isContainsCriterias(Criteria<E> criteria, String str){
            for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()){
                String property = productParser.getPropertyAndValue(entry.getKey().toString(), entry.getValue().toString());
                if (!str.contains(property)){
                    return false;
                }
            }
            return true;
        }


}
