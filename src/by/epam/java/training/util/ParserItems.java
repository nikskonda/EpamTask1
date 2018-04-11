package by.epam.java.training.util;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import by.epam.java.training.entity.Device;
import by.epam.java.training.entity.Laptop;
import by.epam.java.training.entity.Oven;
import by.epam.java.training.entity.Property;
import by.epam.java.training.entity.Refrigerator;

public class ParserItems {
	
	public Oven parserOven(String strOven) {
		Oven oven = new Oven();		
		List<String> list = parserIntoWords(strOven);
		if (!list.isEmpty() && list.get(0).equals(Device.Oven.toString())) {
			int len = list.size();
			for (int i = 1; i<len; i++) {
				Property p = parserProperty(list.get(i));
				switch (p.getName()) {
					case "POWER_CONSUMPTION":
						oven.setPowerConsumption(Integer.parseInt(p.getValue()));
						break;
					case "WEIGHT":
						oven.setWeight(Double.parseDouble(p.getValue()));
						break;
					case "CAPACITY":
						oven.setCapacity(Double.parseDouble(p.getValue()));
						break;
					case "DEPTH":
						oven.setDepth(Double.parseDouble(p.getValue()));
						break;
					case "HEIGHT":
						oven.setHeight(Double.parseDouble(p.getValue()));
						break;
					case "WIDTH":
						oven.setWidth(Double.parseDouble(p.getValue()));
						break;
				}		
			}
		}
		return oven;
	}
	
	public Laptop parserLaptop(String strLaptop) {
		Laptop laptop = new Laptop();
		
		List<String> list = parserIntoWords(strLaptop);
		
		if (!list.isEmpty() && list.get(0).equals(Device.Laptop.toString())) {
			
			int len = list.size();
			
			for (int i = 1; i<len; i++) {
				
				Property p = parserProperty(list.get(i));
				
				switch (p.getName()) {
					case "BATTERY_CAPACITY":
						laptop.setBatteryCapacity(Double.parseDouble(p.getValue()));
						break;
						
					case "OS":
						laptop.setOS(p.getValue());
						break;
						
					case "MEMORY_ROM":
						laptop.setMemoryRom(Integer.parseInt(p.getValue()));
						break;
						
					case "SYSTEM_MEMORY":
						laptop.setSystemMemory(Integer.parseInt(p.getValue()));
						break;
						
					case "CPU":
						laptop.setCPU(Double.parseDouble(p.getValue()));
						break;
						
					case "DISPLAY_INCHS":
						laptop.setDisplayInchs(Double.parseDouble(p.getValue()));
						break;
				}
				
			}
		}
		return laptop;
	}
	
	public Refrigerator parserRefrigerator(String strRefrigerator) {
		Refrigerator refrigerator = new Refrigerator();
		List<String> list = parserIntoWords(strRefrigerator);
		if (!list.isEmpty() && list.get(0).equals(Device.Refrigerator.toString())) {
			int len = list.size();
			for (int i = 1; i<len; i++) {
				Property p = parserProperty(list.get(i));
				switch (p.getName()) {
					case "POWER_CONSUMPTION":
						refrigerator.setPowerConsumption(Integer.parseInt(p.getValue()));
						break;
					case "WEIGHT":
						refrigerator.setWeight(Double.parseDouble(p.getValue()));
						break;
					case "FREEZER_CAPACITY":
						refrigerator.setFreezerCapacity(Double.parseDouble(p.getValue()));
						break;
					case "OVERALL_CAPACITY":
						refrigerator.setOverallCapacity(Double.parseDouble(p.getValue()));
						break;
					case "HEIGHT":
						refrigerator.setHeight(Double.parseDouble(p.getValue()));
						break;
					case "WIDTH":
						refrigerator.setWidth(Double.parseDouble(p.getValue()));
						break;
				}		
			}
		}			
		return refrigerator;
	}
	
	private List<String> parserIntoWords(String str) {	
		Pattern pattern = Pattern.compile("\\s:\\s|,\\s|\\s|;");

		return Arrays.asList(pattern.split(str));
	}
	
	@SuppressWarnings("finally")
	private Property parserProperty(String str) {
		Pattern pattern = Pattern.compile("=");
		String[] array = pattern.split(str);
		Property property = new Property();
		try {		
			//double d = Double.parseDouble(array[1]);
			property.setName(array[0]);
			property.setValue(array[1]);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			return property;
		}
	}
}
