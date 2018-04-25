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
public class TabletPCValidator implements ProductValidator{

    @Override
    public <E> boolean isValid(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {

        	if (!(entry.getKey() instanceof SearchCriteria.TabletPC)) {
        		return false;
        	}
        	
            switch ((SearchCriteria.TabletPC) entry.getKey()) {
                case BATTERY_CAPACITY:
                case DISPLAY_INCHES:
                    if (!ValidatorValue.isValidDouble(entry.getValue())
                            && (Integer) (entry.getValue()) > 0) {
                        return false;
                    }
                    break;
                case MEMORY_ROM:
                case FLASH_MEMORY_CAPACITY:
                    if (!ValidatorValue.isValidInteger(entry.getValue())
                            && (Integer) (entry.getValue()) > 0) {
                        return false;
                    }
                    break;
                case COLOR:
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

    private static <E> boolean isValidNewspaper(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
        	
        	if (!(entry.getKey() instanceof SearchCriteria.Newspaper)) {
        		return false;
        	}
        	
            switch ((SearchCriteria.Newspaper) entry.getKey()) {
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
