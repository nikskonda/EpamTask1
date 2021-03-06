package by.epam.java.training.dao.impl;

import by.epam.java.training.dao.ProductDAO;
import by.epam.java.training.dao.constructor.CounstuctorFactory;
import by.epam.java.training.dao.constructor.ProductConstructor;
import by.epam.java.training.dao.constructor.impl.ProductConstructorImpl;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductDAOImpl implements ProductDAO{
	
	private final String FILE_NAME = "resources/appliances_db.txt";
	
        private ParserManager productParser = new ParserManager();
        
	@Override
	public <E> List<Product> find(Criteria<E> criteria) {
	    List<Product> list = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
		    String line;
            ProductConstructor constr = CounstuctorFactory.getInstance().getProductConstructor();
            while ((line = reader.readLine()) != null) {
                if (isContainsCriterias(criteria, line)){
                    list.add(constr.createProduct(productParser.parseToCriteria(line)));
                    }
            }
		} catch (Exception e) {
		    System.out.println(e);
		} finally{
		    return list;
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
