/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.Refrigerator;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class RefrigeratorConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt((String)properties.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION)));
        refrigerator.setFreezerCapacity(Double.parseDouble((String)properties.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY)));
        refrigerator.setOverallCapacity(Double.parseDouble((String)properties.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY)));
        refrigerator.setHeight(Double.parseDouble((String)properties.get(SearchCriteria.Refrigerator.HEIGHT)));
        refrigerator.setWeight(Double.parseDouble((String)properties.get(SearchCriteria.Refrigerator.WEIGHT)));
        refrigerator.setWidth(Double.parseDouble((String)properties.get(SearchCriteria.Refrigerator.WIDTH)));
        return refrigerator;
    }
    
}
