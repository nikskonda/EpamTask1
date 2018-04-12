package by.epam.java.training.logic;

import by.epam.java.training.entity.*;
import java.util.ArrayList;
import java.util.List;

public class Search implements SearchItemInterface{
	
	@Override
	public List<Item> byType(List<Item> list, Device deviceType){
		List<Item> ans = new ArrayList<Item>();
		
		for (Item i : list) {
			if (i.getDeviceType().equals(deviceType)) {
				ans.add(i);
			}
		}
		
		return ans;			
	}
	
	@Override
	public List<Item> byOvenCharacteristic(List<Item> list, OvenCharacteristic characteristic, Object value){
		List<Item> ans = new ArrayList<Item>();
		Oven o;
		for (Item i : list) {
			if (i.getDeviceType()==Device.Oven) {
				switch (characteristic) {
				case POWER_CONSUMPTION:
					o = (Oven)i;
					if (o.getPowerConsumption()==(Integer)value) {					
						ans.add(i);
					}
					break;
				case CAPACITY:
					o = (Oven)i;
					if (o.getCapacity()==(Double)value){
						ans.add(i);
					}
					break;
				case DEPTH:
					o = (Oven)i;
					if (o.getDepth()==(Double)value){
						ans.add(i);
					}
					break;
				case HEIGHT:
					o = (Oven)i;
					if (o.getHeight()==(Double)value) {				
						ans.add(i);
					}
					break;
				case WEIGHT:
					o = (Oven)i;
					if (o.getWeight()==(Double)value)
					{
						ans.add(i);
					}
					break;
				case WIDTH:
					o = (Oven)i;
					if (o.getWidth()==(Double)value)
					{
						ans.add(i);
					}
					break;
				}	
			}
			
		}
		return ans;			
	}
	
	@Override
	public List<Item> byLaptopCharacteristic(List<Item> list, LaptopCharacteristic characteristic, Object value){
		List<Item> ans = new ArrayList<Item>();
		Laptop l;
		for (Item i : list) {
			if (i.getDeviceType()==Device.Laptop) {
				switch (characteristic) {
				case BATTERY_CAPACITY:
					l = (Laptop)i;
					if (l.getBatteryCapacity()==(Double)value) {					
						ans.add(i);
					}
					break;
				case CPU:
					l = (Laptop)i;
					if (l.getCPU()==(Double)value){
						ans.add(i);
					}
					break;
				case DISPLAY_INCHS:
					l = (Laptop)i;
					if (l.getDisplayInchs()==(Double)value){
						ans.add(i);
					}
					break;
				case MEMORY_ROM:
					l = (Laptop)i;
					if (l.getMemoryRom()==(Integer)value) {				
						ans.add(i);
					}
					break;
				case SYSTEM_MEMORY:
					l = (Laptop)i;
					if (l.getSystemMemory()==(Integer)value)
					{
						ans.add(i);
					}
					break;
				case OS:
					l = (Laptop)i;
					if (l.getOS().equals(value))
					{
						ans.add(i);
					}
					break;
				}
			}
			
		}
		return ans;			
	}
	
	@Override
	public List<Item> byRefrigeratorCharacteristic(List<Item> list, RefrigeratorCharacteristic characteristic, Object value){
		List<Item> ans = new ArrayList<Item>();
		Refrigerator r;
		for (Item i : list) {
			if (i.getDeviceType()==Device.Refrigerator) {
				switch (characteristic) {
				case POWER_CONSUMPTION:
					r = (Refrigerator)i;
					if (r.getPowerConsumption()==(Integer)value) {					
						ans.add(i);
					}
					break;
				case FREEZER_CAPACITY:
					r = (Refrigerator)i;
					if (r.getFreezerCapacity()==(Double)value){
						ans.add(i);
					}
					break;
				case OVERALL_CAPACITY:
					r = (Refrigerator)i;
					if (r.getOverallCapacity()==(Double)value){
						ans.add(i);
					}
					break;
				case HEIGHT:
					r = (Refrigerator)i;
					if (r.getHeight()==(Double)value) {				
						ans.add(i);
					}
					break;
				case WEIGHT:
					r = (Refrigerator)i;
					if (r.getWeight()==(Double)value)
					{
						ans.add(i);
					}
					break;
				case WIDTH:
					r = (Refrigerator)i;
					if (r.getWidth()==(Double)value)
					{
						ans.add(i);
					}
					break;
				}
			}	
		}
		return ans;			
	}
	
}
