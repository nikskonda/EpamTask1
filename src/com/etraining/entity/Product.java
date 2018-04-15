package com.etraining.entity;


public class Product {

	private String name;
	
	private Parameter parameters;

	public Product() {
		this.name = "Unknown";
		this.parameters = new Parameter();
	}
	
	public Product(String name, Parameter parameters) {
		this.name = name;
		this.parameters = parameters;
	}
	
    public void addParameter(String property, Object value) {
        parameters.addParameter(property, value);
    }

    public Parameter getParameters() {
        return parameters;
    }
    
    public void setParmeters(Parameter parameters) {
    	this.parameters = parameters;
    }
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name).append(" : ")
			.append(this.parameters.toString()).append(";");
		return sb.toString();
	}
	
}
