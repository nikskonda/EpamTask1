/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.impl.util;

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
public class ProductParser {
    
        private final String PARSER_WORDS =":|\\s:|:\\s|\\s:\\s|,\\s|\\s|;|,";
        private final String PARSER_PRODUCT_NAME = "^[A-Za-z]+";
        private final String PARSER_PRODUCT_PROPERTY = "=";
        
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

            switch (criteria.getGroupSearchName()){
                case Laptop:
                    parserLaptopProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
                case Newspaper:
                    parserNewspaperProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
                case Oven:
                    parserOvenProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
                case Refrigerator:
                    parserRefrigeratorProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
                case Speakers:
                    parserSpeakersProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
                case TabletPC:
                    parserTabletPCProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
                case TextBook:
                    parserTextBookProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
                case VacuumCleaner:
                    parserVacuumCleanerProperties(parsetValues(parserIntoProperties(str)), criteria);
                    break;
            }   
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
        
        private void parserOvenProperties(Map<String, String> properties, Criteria criteria){                              
            for (Oven o : Oven.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        } 

        private void parserRefrigeratorProperties(Map<String, String> properties, Criteria criteria){                              
            for (Refrigerator o : Refrigerator.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        }     
        
        private void parserVacuumCleanerProperties(Map<String, String> properties, Criteria criteria){                              
            for (VacuumCleaner o : VacuumCleaner.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        } 
        
        private void parserSpeakersProperties(Map<String, String> properties, Criteria criteria){                              
            for (Speakers o : Speakers.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        } 
        
        private void parserLaptopProperties(Map<String, String> properties, Criteria criteria){                              
            for (Laptop o : Laptop.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        } 
        
        private void parserTabletPCProperties(Map<String, String> properties, Criteria criteria){                              
            for (TabletPC o : TabletPC.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        } 
        
        private void parserTextBookProperties(Map<String, String> properties, Criteria criteria){                              
            for (TextBook o : TextBook.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        }
        
        private void parserNewspaperProperties(Map<String, String> properties, Criteria criteria){                              
            for (Newspaper o : Newspaper.values()){
                criteria.add(o, properties.get(o.toString()));
            }
        } 

}
