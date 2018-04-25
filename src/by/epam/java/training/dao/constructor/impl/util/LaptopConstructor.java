/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Laptop;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class LaptopConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties) {
        Laptop laptop = new Laptop();
        laptop.setMemoryRom(Integer.parseInt((String)properties.get(SearchCriteria.Laptop.MEMORY_ROM)));
        laptop.setSystemMemory(Integer.parseInt((String)properties.get(SearchCriteria.Laptop.SYSTEM_MEMORY)));
        laptop.setOS((String)properties.get(SearchCriteria.Laptop.OS));
        laptop.setBatteryCapacity(Double.parseDouble((String)properties.get(SearchCriteria.Laptop.BATTERY_CAPACITY)));
        laptop.setCPU(Double.parseDouble((String)properties.get(SearchCriteria.Laptop.CPU)));
        laptop.setDisplayInches(Double.parseDouble((String)properties.get(SearchCriteria.Laptop.DISPLAY_INCHS)));
        return laptop;    }
    
}
