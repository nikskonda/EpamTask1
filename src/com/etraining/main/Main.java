package com.etraining.main;

import com.etraining.service.CustomFileReader;
import com.etraining.view.Printer;
import com.etraining.entity.Parameter;

public class Main {
    public static void main(String[] args){
    	
        Parameter parameter = new Parameter();
        
        parameter.addParameter("TITLE", "Java");
        parameter.addParameter("NUMBER_OF_PAGES", 669);   
        
        Printer.println(CustomFileReader.findInDBbyParameter(parameter));

    }
}
