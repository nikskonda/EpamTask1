package by.epam.java.training.printer;

import java.util.List;

import by.epam.java.training.entity.Item;

public class PrinterItems implements PrinterItemsInterface{

	@Override
	public void printItems(List<Item> list) {
		for (Item item : list) {
			System.out.println(item);
		}
		
	}

	@Override
	public void printCommentAndItems(String comment, List<Item> list) {
		
		System.out.println(comment);
		
		for (Item item : list) {
			System.out.println(item);
		}
		
	}
	
	
}
