/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.impl;

import by.epam.java.training.dao.impl.util.LaptopParser;
import by.epam.java.training.dao.impl.util.NewspaperParser;
import by.epam.java.training.dao.impl.util.OvenParser;
import by.epam.java.training.dao.impl.util.ProductParser;
import by.epam.java.training.dao.impl.util.RefrigeratorParser;
import by.epam.java.training.dao.impl.util.SpeakersParser;
import by.epam.java.training.dao.impl.util.TabletPCParser;
import by.epam.java.training.dao.impl.util.TextBookParser;
import by.epam.java.training.dao.impl.util.VacuumCleanerParser;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author niksk
 */
public class ParserManager {
    
        private final String PARSER_WORDS =":|\\s:|:\\s|\\s:\\s|,\\s|\\s|;|,";
        private final String PARSER_PRODUCT_NAME = "^[A-Za-z]+";
        private final String PARSER_PRODUCT_PROPERTY = "=";
        
        private Map<ProductLine, ProductParser> parsers = new HashMap<>();

    public ParserManager() {
        parsers.put(ProductLine.Oven, new OvenParser());
        parsers.put(ProductLine.Laptop, new LaptopParser());
        parsers.put(ProductLine.Newspaper, new NewspaperParser());
        parsers.put(ProductLine.Refrigerator, new RefrigeratorParser());
        parsers.put(ProductLine.Speakers, new SpeakersParser());
        parsers.put(ProductLine.TabletPC, new TabletPCParser());
        parsers.put(ProductLine.TextBook, new TextBookParser());
        parsers.put(ProductLine.VacuumCleaner, new VacuumCleanerParser());
    }
        
        
        
        public String getPropertyAndValue(String property, String value){
            StringBuilder sb = new StringBuilder();
            sb.append(property).append("=").append(value);
            return sb.toString();
        }

        public Criteria parseToCriteria(String str) {
		
            Criteria criteria = new Criteria();
            
            String productName = parserProductName(str);
            
            for (ProductLine prod : ProductLine.values()){
                if (prod.toString().equals(productName)){
                    criteria.setGroupSearchName(prod);
                    break;
                }
            }   
            setCriterias(criteria, str);
            return criteria;		
	}
        
        private void setCriterias(Criteria criteria, String str){               
            this.parsers.get(criteria.getGroupSearchName())
                    .execute(parsetValues(parserIntoProperties(str)), criteria);               
        }
                     
        private String parserProductName(String str){
            Pattern p = Pattern.compile(PARSER_PRODUCT_NAME);
            Matcher m = p.matcher(str);
            if (m.find()){
                return m.group();
            } else {
                return null;
            }
        }
   
    
	private List<String> parserIntoProperties(String str) {
            Pattern pattern = Pattern.compile(PARSER_WORDS);
            List<String> result = new ArrayList<String>();
            for (String s : pattern.split(str)){
                if (s.contains(PARSER_PRODUCT_PROPERTY)){
                   result.add(s);
                }
            }
            return result;
	}
        
        private Map<String, String> parsetValues(List<String> properties){
            Map<String, String> result = new HashMap<String, String>();
            
            Pattern pattern = Pattern.compile(PARSER_PRODUCT_PROPERTY); 
            for (String str : properties){
                String[] value = pattern.split(str);
                if (value.length==2){
                    result.put(value[0], value[1]);
                }
            }
            
            return result;
        }
               
}
