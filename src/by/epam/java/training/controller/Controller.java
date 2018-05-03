package by.epam.java.training.controller;


import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria.*;
import by.epam.java.training.printer.ProductPrinter;
import by.epam.java.training.service.ServiceFactory;

import java.util.List;


public class Controller {
	public static void main(String[] args) {
            Criteria criteria = new Criteria(ProductLine.Newspaper);
            criteria.add(Newspaper.PERIODICITY, "1x30");
            
            List<Product> productList = ServiceFactory.getInstance().getProductService().find(criteria);
            
            ProductPrinter printer = new ProductPrinter();           

            for (Product product : productList){
                printer.printProduct(product);
            }

	}
	
}
