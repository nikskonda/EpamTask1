package by.epam.java.training.util;

import by.epam.java.training.entity.Laptop;
import by.epam.java.training.entity.Oven;
import by.epam.java.training.entity.Refrigerator;

public interface ParserItemsInterface {
	 Oven parserOven(String strOven);	
	
	Laptop parserLaptop(String strLaptop);
	
	Refrigerator parserRefrigerator(String strRefrigerator);
}
