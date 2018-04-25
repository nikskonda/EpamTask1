/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Oven;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class OvenConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties){
        Oven oven = new Oven();
        oven.setPowerConsumption(Integer.parseInt((String)properties.get(SearchCriteria.Oven.POWER_CONSUMPTION)));
        oven.setCapacity(Double.parseDouble((String)properties.get(SearchCriteria.Oven.CAPACITY)));
        oven.setDepth(Double.parseDouble((String)properties.get(SearchCriteria.Oven.DEPTH)));
        oven.setHeight(Double.parseDouble((String)properties.get(SearchCriteria.Oven.HEIGHT)));
        oven.setWeight(Double.parseDouble((String)properties.get(SearchCriteria.Oven.WEIGHT)));
        oven.setWidth(Double.parseDouble((String)properties.get(SearchCriteria.Oven.WIDTH)));
        return oven;
    }       
}
