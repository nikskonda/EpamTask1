package by.epam.java.training.service.validation;

import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria.*;
import by.epam.java.training.service.validation.util.LaptopValidator;
import by.epam.java.training.service.validation.util.NewspaperValidator;
import by.epam.java.training.service.validation.util.OvenValidator;
import by.epam.java.training.service.validation.util.RefrigeratorValidator;
import by.epam.java.training.service.validation.util.SpeakersValidator;
import by.epam.java.training.service.validation.util.TabletPCValidator;
import by.epam.java.training.service.validation.util.TextBookValidator;
import by.epam.java.training.service.validation.util.VacuumCleanerValidator;
import java.util.HashMap;
import java.util.Map;

public class ValidatorCriteria<E> {

    private Map<ProductLine, ProductValidator> validators = new HashMap<>();
    
    public ValidatorCriteria(){
        this.validators.put(ProductLine.Oven, new OvenValidator());
        this.validators.put(ProductLine.Laptop, new LaptopValidator());
        this.validators.put(ProductLine.Newspaper, new NewspaperValidator());
        this.validators.put(ProductLine.Refrigerator, new RefrigeratorValidator());
        this.validators.put(ProductLine.Speakers, new SpeakersValidator());
        this.validators.put(ProductLine.TabletPC, new TabletPCValidator());
        this.validators.put(ProductLine.TextBook, new TextBookValidator());
        this.validators.put(ProductLine.VacuumCleaner, new VacuumCleanerValidator());                
    }
    
    
    public <E> boolean isValidCriteria(Criteria<E> criteria) {                    
        return validators.get(criteria.getProductLine()).isValid(criteria);
    }
    
}
