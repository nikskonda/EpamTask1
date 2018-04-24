/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl;

import by.epam.java.training.dao.constructor.ProductConstructor;
import by.epam.java.training.entity.Laptop;
import by.epam.java.training.entity.Newspaper;
import by.epam.java.training.entity.Oven;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.Refrigerator;
import by.epam.java.training.entity.Speakers;
import by.epam.java.training.entity.TabletPC;
import by.epam.java.training.entity.TextBook;
import by.epam.java.training.entity.VacuumCleaner;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class ProductConstructorImpl implements ProductConstructor{
    @Override
    public <E> Product createProduct(Criteria<E> criteria) {
        
        switch (criteria.getGroupSearchName()) {
            case Oven:
                return ProductConstructorImpl.createOven(criteria);
            case Laptop:
                return ProductConstructorImpl.createLaptop(criteria);
            case TabletPC:    
                return ProductConstructorImpl.createTabletPC(criteria);
            case Refrigerator:
                return ProductConstructorImpl.createRefrigerator(criteria);
            case Speakers:
                return ProductConstructorImpl.createSpeakers(criteria);
            case VacuumCleaner:
                return ProductConstructorImpl.createVacuumCleaner(criteria);
            case Newspaper:
                return ProductConstructorImpl.createNewspaper(criteria);
            case TextBook:
                return ProductConstructorImpl.createTextBook(criteria);
            default:
                return null;
        }
    }

    private static <E> Oven createOven(Criteria<E> criteria) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Integer.parseInt((String)criteria.getCriteria().get(SearchCriteria.Oven.POWER_CONSUMPTION)));
        oven.setCapacity(Double.parseDouble((String)criteria.getCriteria().get(SearchCriteria.Oven.CAPACITY)));
        oven.setDepth(Double.parseDouble((String)criteria.getCriteria().get(SearchCriteria.Oven.DEPTH)));
        oven.setHeight(Double.parseDouble((String)criteria.getCriteria().get(SearchCriteria.Oven.HEIGHT)));
        oven.setWeight(Double.parseDouble((String)criteria.getCriteria().get(SearchCriteria.Oven.WEIGHT)));
        oven.setWidth(Double.parseDouble((String)criteria.getCriteria().get(SearchCriteria.Oven.WIDTH)));
        return oven;
    }

    private static <E> Refrigerator createRefrigerator(Criteria<E> criteria) {
        Map<E, Object> c = criteria.getCriteria();
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt((String)c.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION)));
        refrigerator.setFreezerCapacity(Double.parseDouble((String)c.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY)));
        refrigerator.setOverallCapacity(Double.parseDouble((String)c.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY)));
        refrigerator.setHeight(Double.parseDouble((String)c.get(SearchCriteria.Refrigerator.HEIGHT)));
        refrigerator.setWeight(Double.parseDouble((String)c.get(SearchCriteria.Refrigerator.WEIGHT)));
        refrigerator.setWidth(Double.parseDouble((String)c.get(SearchCriteria.Refrigerator.WIDTH)));
        return refrigerator;
    }

    private static <E> VacuumCleaner createVacuumCleaner(Criteria<E> criteria) {
        Map<E, Object> c = criteria.getCriteria();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Integer.parseInt((String)c.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION)));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt((String)c.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION)));
        vacuumCleaner.setCleaningWidth(Integer.parseInt((String)c.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH)));
        vacuumCleaner.setBagType((String)c.get(SearchCriteria.VacuumCleaner.BAG_TYPE));
        vacuumCleaner.setFilterType((String)c.get(SearchCriteria.VacuumCleaner.FILTER_TYPE));
        vacuumCleaner.setWandType((String)c.get(SearchCriteria.VacuumCleaner.WAND_TYPE));
        return vacuumCleaner;
    }
    
    
    private static <E> Speakers createSpeakers(Criteria<E> criteria) {
        Map<E, Object> c = criteria.getCriteria();
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt((String)c.get(SearchCriteria.Speakers.POWER_CONSUMPTION)));
        speakers.setNumberOfSpeakers(Integer.parseInt((String)c.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS)));
        speakers.setCordLength(Integer.parseInt((String)c.get(SearchCriteria.Speakers.CORD_LENGTH)));
        speakers.setFrequencyRange((String)c.get(SearchCriteria.Speakers.FREQUENCY_RANGE));
        return speakers;
    }
    
    private static <E> Laptop createLaptop(Criteria<E> criteria) {
        Map<E, Object> c = criteria.getCriteria();
        Laptop laptop = new Laptop();
        laptop.setMemoryRom(Integer.parseInt((String)c.get(SearchCriteria.Laptop.MEMORY_ROM)));
        laptop.setSystemMemory(Integer.parseInt((String)c.get(SearchCriteria.Laptop.SYSTEM_MEMORY)));
        laptop.setOS((String)c.get(SearchCriteria.Laptop.OS));
        laptop.setBatteryCapacity(Double.parseDouble((String)c.get(SearchCriteria.Laptop.BATTERY_CAPACITY)));
        laptop.setCPU(Double.parseDouble((String)c.get(SearchCriteria.Laptop.CPU)));
        laptop.setDisplayInches(Double.parseDouble((String)c.get(SearchCriteria.Laptop.DISPLAY_INCHS)));

        return laptop;
    }
    
    private static <E> TabletPC createTabletPC(Criteria<E> criteria) {
        Map<E, Object> c = criteria.getCriteria();
        TabletPC tabletPC = new TabletPC();
        tabletPC.setMemoryRom(Integer.parseInt((String)c.get(SearchCriteria.TabletPC.MEMORY_ROM)));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt((String)c.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY)));
        tabletPC.setColor((String)c.get(SearchCriteria.TabletPC.COLOR));
        tabletPC.setBatteryCapacity(Double.parseDouble((String)c.get(SearchCriteria.TabletPC.BATTERY_CAPACITY)));
        tabletPC.setDisplayInches(Double.parseDouble((String)c.get(SearchCriteria.TabletPC.DISPLAY_INCHES)));
        return tabletPC;
    }
    
    private static <E> TextBook createTextBook(Criteria<E> criteria) {
        Map<E, Object> c = criteria.getCriteria();
        TextBook textBook = new TextBook();
        textBook.setAuthor((String)c.get(SearchCriteria.TextBook.AUTHOR));
        textBook.setSubject((String)c.get(SearchCriteria.TextBook.SUBJECT));
        textBook.setTitle((String)c.get(SearchCriteria.TextBook.TITLE));
        textBook.setNumberOfPages(Integer.parseInt((String)c.get(SearchCriteria.TextBook.NUMBER_OF_PAGES)));
        return textBook;
    }
    
    private static <E> Newspaper createNewspaper(Criteria<E> criteria) {
        Map<E, Object> c = criteria.getCriteria();
        Newspaper newspaper = new Newspaper();
        newspaper.setPaidOfFree((String)c.get(SearchCriteria.Newspaper.PAID_OR_FREE));
        newspaper.setPeriodicity((String)c.get(SearchCriteria.Newspaper.PERIODICITY));
        newspaper.setTitle((String)c.get(SearchCriteria.Newspaper.TITLE));
        return newspaper;
    }
    
}
