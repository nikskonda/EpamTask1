/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.VacuumCleaner;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class VacuumCleanerConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Integer.parseInt((String)properties.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION)));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt((String)properties.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION)));
        vacuumCleaner.setCleaningWidth(Integer.parseInt((String)properties.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH)));
        vacuumCleaner.setBagType((String)properties.get(SearchCriteria.VacuumCleaner.BAG_TYPE));
        vacuumCleaner.setFilterType((String)properties.get(SearchCriteria.VacuumCleaner.FILTER_TYPE));
        vacuumCleaner.setWandType((String)properties.get(SearchCriteria.VacuumCleaner.WAND_TYPE));
        return vacuumCleaner;    }
    
}
