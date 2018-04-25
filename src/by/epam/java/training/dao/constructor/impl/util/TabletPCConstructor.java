/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.TabletPC;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class TabletPCConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setMemoryRom(Integer.parseInt((String)properties.get(SearchCriteria.TabletPC.MEMORY_ROM)));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt((String)properties.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY)));
        tabletPC.setColor((String)properties.get(SearchCriteria.TabletPC.COLOR));
        tabletPC.setBatteryCapacity(Double.parseDouble((String)properties.get(SearchCriteria.TabletPC.BATTERY_CAPACITY)));
        tabletPC.setDisplayInches(Double.parseDouble((String)properties.get(SearchCriteria.TabletPC.DISPLAY_INCHES)));
        return tabletPC;    }
    
}
