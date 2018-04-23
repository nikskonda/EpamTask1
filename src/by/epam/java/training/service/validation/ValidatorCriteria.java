package by.epam.java.training.service.validation;

import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.SearchCriteria.*;
import java.util.Map;


public class ValidatorCriteria<E> {
	
	public static <E> boolean isValidCriteria(Criteria<E> criteria) {
		
		return true;

	}
	
	private <E> boolean isValidOven(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((Oven)entry.getKey()) {								
				case CAPACITY:					
				case DEPTH:					
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
		
		return true;
	}
	
	private <E> boolean isValidRefrigerator(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((Refrigerator)entry.getKey()) {						
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
		return true;
	}
	
	private <E> boolean isValidVacuumCleaner(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((VacuumCleaner)entry.getKey()) {						
				case BAG_TYPE:
				case FILTER_TYPE:
				case WAND_TYPE:
					if (!ValidatorValue.isValidString(entry.getValue())) {
						return false;
					}
					break;
				case CLEANING_WIDTH:
				case MOTOR_SPEED_REGULATION:					
				case POWER_CONSUMPTION:
					if (!ValidatorValue.isValidInteger(entry.getValue()) && 
							(Integer)(entry.getValue())>0) {
						return false;
					}
					break;			
				default:
					return false;
			}
		}	
		return true;
	}
	
	private <E> boolean isValidSpeakers(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((Speakers)entry.getKey()) {										
				case CORD_LENGTH:
				case NUMBER_OF_SPEAKERS:					
				case POWER_CONSUMPTION:
					if (!ValidatorValue.isValidInteger(entry.getValue()) && 
							(Integer)(entry.getValue())>0) {
						return false;
					}
					break;
				case FREQUENCY_RANGE:
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
	
	private <E> boolean isValidLaptop(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((Laptop)entry.getKey()) {										
				case BATTERY_CAPACITY:
				case CPU:					
				case DISPLAY_INCHS:
					if (!ValidatorValue.isValidDouble(entry.getValue()) && 
							(Integer)(entry.getValue())>0) {
						return false;
					}
					break;
				case MEMORY_ROM:					
				case SYSTEM_MEMORY:
					if (!ValidatorValue.isValidInteger(entry.getValue()) && 
							(Integer)(entry.getValue())>0) {
						return false;
					}
					break;
				case OS:
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
	
	private <E> boolean isValidTabletPC(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((TabletPC)entry.getKey()) {										
				case BATTERY_CAPACITY:					
				case DISPLAY_INCHES:
					if (!ValidatorValue.isValidDouble(entry.getValue()) && 
							(Integer)(entry.getValue())>0) {
						return false;
					}
					break;
				case MEMORY_ROM:					
				case FLASH_MEMORY_CAPACITY:
					if (!ValidatorValue.isValidInteger(entry.getValue()) && 
							(Integer)(entry.getValue())>0) {
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
	
	private <E> boolean isValidNewspaper(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((Newspaper)entry.getKey()) {										
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
	
	private <E> boolean isValidTextBook(Criteria<E> criteria) {		
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {			
			switch ((TextBook)entry.getKey()) {										
				case TITLE:					
				case AUTHOR:
				case SUBJECT:
					if (!ValidatorValue.isValidString(entry.getValue())) {
						return false;
					}
					break;
				case NUMBER_OF_PAGES:
					if (!ValidatorValue.isValidInteger(entry.getValue()) && 
							(Integer)(entry.getValue())>0) {
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
