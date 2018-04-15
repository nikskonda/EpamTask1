package com.etraining.entity;

import java.util.HashMap;
import java.util.Map;

public class Parameter {
	private Map<String, Object> parameters;
	
	public Parameter() {
		this.parameters = new HashMap<String, Object>();
	}
	
    public void addParameter(String property, Object value) {
        parameters.put(property, value);
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }
    
    public void setParmeters(Map<String, Object> parameters) {
    	this.parameters = parameters;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();  	
    	int count = 0;   	
		for (Map.Entry<String, Object> entry : this.parameters.entrySet()) {
			count++;
			sb.append(entry.getKey()).append("=").append(entry.getValue().toString());
			if (count!=this.parameters.size()) {
				sb.append(", ");
			}
		} 	
    	return sb.toString();
    }
}

