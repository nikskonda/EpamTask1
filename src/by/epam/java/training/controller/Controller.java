package by.epam.java.training.controller;

import java.util.List;

import by.epam.java.training.entity.Device;
import by.epam.java.training.entity.Item;
import by.epam.java.training.entity.Laptop;
import by.epam.java.training.entity.Oven;
import by.epam.java.training.entity.Refrigerator;
import by.epam.java.training.util.Converter;
import by.epam.java.training.util.ParserItems;
import by.epam.java.training.util.Reader;

public class Controller {
	public static void main(String[] args) {
		List<String> dataFile = Reader.readLinesFromFile("appliances_db.txt");
		
		List<Item> items = Converter.ToItems(dataFile);
		
		for (Item i : items) {
			System.out.println(i);
		}
	}
	
}
