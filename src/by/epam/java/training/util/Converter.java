package by.epam.java.training.util;

import by.epam.java.training.entity.Product;

import java.util.List;
import java.util.ArrayList;

public class Converter implements ConverterInterface{
	
	@Override
	public List<Product> ToItems(List<String> data){
		List<Product> list = new ArrayList<Product>();
		ParserItems pi = new ParserItems();
		for (String str : data) {
			Item item = null;
			if (str.startsWith(Device.Oven.toString())) {
				item = pi.parserOven(str);
			} 
			if (str.startsWith(Device.Laptop.toString())) {
				item = pi.parserLaptop(str);
			}
			if (str.startsWith(Device.Refrigerator.toString())) {
				item = pi.parserRefrigerator(str);
			}
			if (item != null) {
				list.add(item);
			}			
		}	
		return list;
	}
}
