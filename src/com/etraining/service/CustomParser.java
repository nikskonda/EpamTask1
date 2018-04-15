package com.etraining.service;

import java.util.regex.Pattern;
import com.etraining.entity.Parameter;
import com.etraining.entity.Product;

public class CustomParser {
	public Product parseProduct(String str) {
		Product product = new Product();		
		String[] temp = parserIntoWords(str);		
		if (temp.length > 1) {
			product.setName(temp[0]);
			product.setParmeters(parserParameter(Util.cutArray(temp, 1, temp.length)));
		}
		return product;
		
	}
	
	private String[] parserIntoWords(String str) {	
		Pattern pattern = Pattern.compile(":|\\s:|:\\s|\\s:\\s|,\\s|\\s|;|,");
		return pattern.split(str);
	}
	
	private Parameter parserParameter(String[] str) {
		Pattern pattern = Pattern.compile("=");		  
		Parameter parameter = new Parameter();		
		for (String s : str) {			
			String[] temp = pattern.split(s);
			if (temp.length == 2) {
				if (Util.isInt(temp[1])) {
					parameter.addParameter(temp[0], Integer.parseInt(temp[1]));
				} else {
					if (Util.isDouble(temp[1])) {
						parameter.addParameter(temp[0], Double.parseDouble(temp[1]));
					}
					else {
						parameter.addParameter(temp[0], temp[1]);
					}
				}
			}			
		}
		return parameter;
	}
}
