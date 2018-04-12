package by.epam.java.training.logic;

import java.util.List;

import by.epam.java.training.entity.Device;
import by.epam.java.training.entity.Item;
import by.epam.java.training.entity.LaptopCharacteristic;
import by.epam.java.training.entity.OvenCharacteristic;
import by.epam.java.training.entity.RefrigeratorCharacteristic;

public interface SearchItemInterface {

	List<Item> byType(List<Item> list, Device deviceType);
	
	List<Item> byOvenCharacteristic(List<Item> list, OvenCharacteristic characteristic, Object value);
	
	List<Item> byLaptopCharacteristic(List<Item> list, LaptopCharacteristic characteristic, Object value);
	
	List<Item> byRefrigeratorCharacteristic(List<Item> list, RefrigeratorCharacteristic characteristic, Object value);
}
