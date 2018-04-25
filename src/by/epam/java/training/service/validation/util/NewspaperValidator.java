/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.service.validation.util;

import by.epam.java.training.entity.criteria.Criteria;
import static by.epam.java.training.entity.criteria.SearchCriteria.*;
import by.epam.java.training.service.validation.ProductValidator;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class NewspaperValidator implements ProductValidator{

    @Override
    public <E> boolean isValid(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
        	
        	if (!(entry.getKey() instanceof Newspaper)) {
        		return false;
        	}
        	
            switch ((Newspaper) entry.getKey()) {
                case TITLE:
                case PAID_OR_FREE:
                case PERIODICITY:
                    if (!ValidatorValue.isValidString(entry.getValue())) {
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
