package by.epam.java.training.controller;

import java.util.List;
import by.epam.java.training.entity.Device;
import by.epam.java.training.entity.Item;
import by.epam.java.training.entity.Laptop;
import by.epam.java.training.entity.LaptopCharacteristic;
import by.epam.java.training.entity.OperatingSystem;
import by.epam.java.training.entity.Oven;
import by.epam.java.training.entity.OvenCharacteristic;
import by.epam.java.training.entity.Refrigerator;
import by.epam.java.training.entity.RefrigeratorCharacteristic;
import by.epam.java.training.logic.Search;
import by.epam.java.training.printer.PrinterItems;
import by.epam.java.training.printer.PrinterItemsInterface;
import by.epam.java.training.util.Converter;
import by.epam.java.training.util.ParserItems;
import by.epam.java.training.util.Reader;

public class Controller {
	public static void main(String[] args) {
		
		List<String> dataFile = new Reader().readLinesFromFile("appliances_db.txt");
	
		List<Item> items = (new Converter()).ToItems(dataFile);
		
		PrinterItems p = new PrinterItems();		
		p.printCommentAndItems("All:", items);

		Search s = new Search();
		
		List<Item> overs = s.byType(items, Device.Oven);		
		p.printCommentAndItems("\nOvers", overs);
				
		List<Item> o = s.byOvenCharacteristic(items, OvenCharacteristic.POWER_CONSUMPTION, 1000);		
		p.printCommentAndItems("\nSearch POWER_CONSUMPTION=1000", o);

		List<Item> l = s.byLaptopCharacteristic(items, LaptopCharacteristic.OS, OperatingSystem.Windows);				
		p.printCommentAndItems("\nSearch OS=Windows", l);
		
		List<Item> r = s.byRefrigeratorCharacteristic(items, RefrigeratorCharacteristic.OVERALL_CAPACITY, 350.5);			
		p.printCommentAndItems("\nSearch OVERALL_CAPACITY=350.5", r);

	}
	
}
