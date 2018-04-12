package by.epam.java.training.printer;

import java.util.List;
import by.epam.java.training.entity.Item;

public interface PrinterItemsInterface {
	
	void printItems(List<Item> list);
	
	void printCommentAndItems(String str, List<Item> list);
}
