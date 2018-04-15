package com.etraining.service;

import java.util.Map;

import com.etraining.entity.Parameter;
import com.etraining.entity.Product;

public class CustomSearch {

	public boolean findParameterInProduct(Product product, Parameter parameter) {
		boolean f = true;
		
		for (Map.Entry<String, Object> entry : parameter.getParameters().entrySet()) {
			
			Parameter p = product.getParameters();
			
			boolean q = true;
			
			if (p.getParameters().containsKey(entry.getKey())) {
				if (!p.getParameters().get(entry.getKey()).equals(entry.getValue())){
					q = false;
				}
			}
			else {
				q = false;
			}
			if (!q) {
				f = false;
				break;
			}
		}
		return f;
	}
}
