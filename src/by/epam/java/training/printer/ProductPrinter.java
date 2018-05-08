package by.epam.java.training.printer;

import by.epam.java.training.entity.Product;
import java.util.List;

public class ProductPrinter{
        public void printProduct(Product product) {
            System.out.println(product.asString());
	}

	public void printProductList(List<Product> productList){
        for (Product product : productList){
            printProduct(product);
        }
    }
}
