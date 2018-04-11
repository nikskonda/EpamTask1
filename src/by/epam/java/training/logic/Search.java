package by.epam.java.training.logic;

import by.epam.java.training.entity.*;
import java.util.ArrayList;
import java.util.List;

public class Search {
	
	public List<Item> byType(List<Item> list, Device deviceType){
		List<Item> ans = new ArrayList<Item>();
		
		for (Item i : list) {
			if (i.getDeviceType().equals(deviceType)) {
				ans.add(i);
			}
		}
		
		return ans;			
	}
	
	public List<Item> byOvenCharacteristic(List<Item> list, OvenCharacteristic characteristic, int value){
		List<Item> ans = new ArrayList<Item>();
		Oven o;
		for (Item i : list) {
			switch (characteristic) {
				case POWER_CONSUMPTION:
					o = (Oven)i;
					if (o.getPowerConsumption()==value) {					
						ans.add(i);
					}
					break;
				case CAPACITY:
					o = (Oven)i;
					if (o.getCapacity()==value){
						ans.add(i);
					}
					break;
				case DEPTH:
					o = (Oven)i;
					if (o.getDepth()==value){
						ans.add(i);
					}
					break;
				case HEIGHT:
					o = (Oven)i;
					if (o.getHeight()==value) {				
						ans.add(i);
					}
					break;
				case WEIGHT:
					o = (Oven)i;
					if (o.getWeight()==value)
					{
						ans.add(i);
					}
					break;
				case WIDTH:
					o = (Oven)i;
					if (o.getWidth()==value)
					{
						ans.add(i);
					}
					break;
			}	
		}
		return ans;			
	}
	
}
