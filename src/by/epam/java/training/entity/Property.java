package by.epam.java.training.entity;

public class Property {

	private String name;
	
	private String value;
	
	public Property() {
		
	}
	
	public Property(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name!=null && !name.equals(""))
		{
			this.name = name;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		if (value!=null && !value.equals("")) {
			this.value = value;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
