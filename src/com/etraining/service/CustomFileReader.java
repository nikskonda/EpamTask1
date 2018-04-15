package com.etraining.service;

import com.etraining.entity.Parameter;
import com.etraining.entity.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class CustomFileReader {
    private static final String filePath = System.getProperty("user.dir") + "\\src\\com\\etraining\\appliances_db.txt";
    
    public static String find(Parameter parameter) {
        StringBuilder result = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String fileLine;
            int count = 0;
            Map<String,Object> mapOfParameters = parameter.getParameters();
            while((fileLine = bufferedReader.readLine()) != null) {
                for(Map.Entry<String,Object> entry : mapOfParameters.entrySet()) {
                    boolean flag = match(fileLine,entry.getKey(),entry.getValue());
                    if(flag)
                        count++;
                }
                if(count == mapOfParameters.size()) {
                    result.append(fileLine + "\n");
                }
                count = 0;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString().length() == 0 ? "Ð�Ð¸Ñ‡ÐµÐ³Ð¾ Ð½Ðµ Ð½Ð°Ð¹Ð´ÐµÐ½Ð¾." : result.toString();
    }
    
    private static boolean match(String fileLine, Object searchParameter, Object value) {
        String parameter = " " + searchParameter + "=" + value;
        return fileLine.contains(parameter);
    }
    
    
    public static String findInDBbyParameter(Parameter parameter) {
		
    	StringBuilder result = new StringBuilder();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            
            CustomParser parser = new CustomParser();
            CustomSearch search = new CustomSearch();
            
            while ((line = reader.readLine()) != null) {
                
            	if (line.length()>0) {
            		Product product = parser.parseProduct(line);
            		if (search.findParameterInProduct(product, parameter)) {
                		result.append(line).append("\n");
                	}
            	}         	
            }            
        } catch (Exception e) {
            // log error
        }
		return result.toString().length() == 0 ? "Not found." : result.toString();
	}
}
