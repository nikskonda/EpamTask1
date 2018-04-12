package by.epam.java.training.util;

import java.util.List;

import by.epam.java.training.entity.Item;

public interface ConverterInterface {

	List<Item> ToItems(List<String> data);
	
}
