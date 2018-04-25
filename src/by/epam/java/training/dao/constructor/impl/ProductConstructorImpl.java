/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl;

import by.epam.java.training.dao.constructor.ProductConstructor;
import by.epam.java.training.dao.constructor.impl.util.LaptopConstructor;
import by.epam.java.training.dao.constructor.impl.util.NewspaperConstructor;
import by.epam.java.training.dao.constructor.impl.util.OvenConstructor;
import by.epam.java.training.dao.constructor.impl.util.RefrigeratorConstructor;
import by.epam.java.training.dao.constructor.impl.util.SpeakersConstructor;
import by.epam.java.training.dao.constructor.impl.util.TabletPCConstructor;
import by.epam.java.training.dao.constructor.impl.util.TextBookConstructor;
import by.epam.java.training.dao.constructor.impl.util.VacuumCleanerConstructor;
import by.epam.java.training.entity.Laptop;
import by.epam.java.training.entity.Newspaper;
import by.epam.java.training.entity.Oven;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.Refrigerator;
import by.epam.java.training.entity.Speakers;
import by.epam.java.training.entity.TabletPC;
import by.epam.java.training.entity.TextBook;
import by.epam.java.training.entity.VacuumCleaner;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class ProductConstructorImpl implements ProductConstructor{
    
    private Map<ProductLine, Constructor> constructors = new HashMap<>();
    
    public ProductConstructorImpl(){
        this.constructors.put(ProductLine.Oven, new OvenConstructor());
        this.constructors.put(ProductLine.Laptop, new LaptopConstructor());
        this.constructors.put(ProductLine.Newspaper, new NewspaperConstructor());
        this.constructors.put(ProductLine.Refrigerator, new RefrigeratorConstructor());
        this.constructors.put(ProductLine.Speakers, new SpeakersConstructor());
        this.constructors.put(ProductLine.TabletPC, new TabletPCConstructor());
        this.constructors.put(ProductLine.TextBook, new TextBookConstructor());
        this.constructors.put(ProductLine.VacuumCleaner, new VacuumCleanerConstructor());                
    }
    
    @Override
    public <E> Product createProduct(Criteria<E> criteria) {
        Constructor constructor = constructors.get(criteria.getGroupSearchName());           
        return constructor.execute(criteria.getCriteria());           
    }     
}
