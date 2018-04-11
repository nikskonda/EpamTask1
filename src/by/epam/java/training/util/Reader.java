package by.epam.java.training.util;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class Reader {
	public static List<String> readLinesFromFile(String fileName) {
		
		List<String> list= new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }            
        } catch (Exception e) {
            // log error
        }
		
		return list;
	}
}
