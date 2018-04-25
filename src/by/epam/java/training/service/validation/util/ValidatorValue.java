package by.epam.java.training.service.validation.util;

public class ValidatorValue {
	
	public static boolean isValidNumber(Object obj) {
		return obj instanceof Number;
	}
	
	public static boolean isValidString(Object obj) {
		return obj instanceof String;
	}
	
	public static boolean isValidDouble(Object obj) {
		return isValidInteger(obj) || (obj instanceof Double);
	}
	
	public static boolean isValidInteger(Object obj) {
		return obj instanceof Integer;
	}
	
}
