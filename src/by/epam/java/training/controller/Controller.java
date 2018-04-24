package by.epam.java.training.controller;


import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria.*;
import by.epam.java.training.printer.ProductPrinter;
import by.epam.java.training.service.ServiceFactory;


public class Controller {
	public static void main(String[] args) {
            Criteria criteria = new Criteria(ProductLine.Oven);
            criteria.add(Oven.CAPACITY, 32);
            
            Product product = ServiceFactory.getInstance().getProductService().find(criteria);
            
            ProductPrinter printer = new ProductPrinter();           
            printer.printProduct(product);
	}
	
}
