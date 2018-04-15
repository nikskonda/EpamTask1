package com.etraining.main;

import com.etraining.service.CustomFileReader;
import com.etraining.view.Printer;
import com.etraining.entity.Parameter;

public class Main {
    public static void main(String[] args){
    	
        Parameter parameter = new Parameter();
        
        parameter.addParameter("WIDTH", 70);
        parameter.addParameter("WEIGHT", 20);   
        
        Printer.println(CustomFileReader.findInDBbyParameter(parameter));

    }
}