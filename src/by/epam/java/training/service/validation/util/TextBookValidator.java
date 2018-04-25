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
public class TextBookValidator implements ProductValidator{

    @Override
    public <E> boolean isValid(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
        	
        	if (!(entry.getKey() instanceof SearchCriteria.TextBook)) {
        		return false;
        	}
        	
            switch ((SearchCriteria.TextBook) entry.getKey()) {
                case TITLE:
                case AUTHOR:
                case SUBJECT:
                    if (!ValidatorValue.isValidString(entry.getValue())) {
                        return false;
                    }
                    break;
                case NUMBER_OF_PAGES:
                    if (!ValidatorValue.isValidInteger(entry.getValue())
                            && (Integer) (entry.getValue()) > 0) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
    
}
