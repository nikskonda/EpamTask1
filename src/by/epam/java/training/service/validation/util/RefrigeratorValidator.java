/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.service.validation.util;

import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria;
import by.epam.java.training.service.validation.ProductValidator;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class RefrigeratorValidator implements ProductValidator{

    @Override
    public <E> boolean isValid(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
        	       	
        	if (!(entry.getKey() instanceof SearchCriteria.Refrigerator)) {
        		return false;
        	}
        	
            switch ((SearchCriteria.Refrigerator) entry.getKey()) {
                case FREEZER_CAPACITY:
                case OVERALL_CAPACITY:
                case HEIGHT:
                case WEIGHT:
                case WIDTH:
                    if (!ValidatorValue.isValidDouble(entry.getValue())) {
                        return false;
                    }
                    break;
                case POWER_CONSUMPTION:
                    if (!ValidatorValue.isValidInteger(entry.getValue())) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;    }
    
}
