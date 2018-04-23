package by.epam.java.training.entity;

public class Computers extends Product{
	
	public static final String TAG = Computers.class.getSimpleName();
	
	private double batteryCapacity;

	private int memoryRom;
	
	private double displayInches;
	
	public Computers() {
		super();
	}
	
	public Computers(double batteryCapacity, int memoryRom, double displayInches) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.memoryRom = memoryRom;
		this.displayInches = displayInches;
	}
	
	public double getBatteryCapacity() {
		return this.batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		if (batteryCapacity > 0) {
			this.batteryCapacity = batteryCapacity;
		} else {
			throw new IllegalArgumentException();
		}
	}

	

	public int getMemoryRom() {
		return this.memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		if (memoryRom > 0) {
			this.memoryRom = memoryRom;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public double getDisplayInches() {
		return this.displayInches;
	}

	public void setDisplayInches(double displayInches) {
		if (displayInches > 0) {
			this.displayInches = displayInches;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
