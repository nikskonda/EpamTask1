package by.epam.java.training.entity;

import java.io.Serializable;

public class Computers implements Product, Serializable {

	private static final long serialVersionUID = 1L;
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
        
	public String getProprties(){
            StringBuilder sb = new StringBuilder();
            sb.append("BATTERY_CAPACITY=").append(this.batteryCapacity)
			.append(", MEMORY_ROM=").append(this.memoryRom)
			.append(", DISPLAY_INCHES=").append(this.displayInches)
                    ;
            return sb.toString();
	}

	@Override
	public String asString(){
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Computers computers = (Computers) obj;
		if (Double.compare(computers.batteryCapacity, batteryCapacity) != 0) return false;
		if (memoryRom != computers.memoryRom) return false;
		if (Double.compare(computers.displayInches, displayInches) != 0) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = 1;
		hashCode = hashCode * prime + Double.hashCode(this.batteryCapacity);
		hashCode = hashCode * prime + this.memoryRom;
		hashCode = hashCode * prime + Double.hashCode(this.displayInches);
		return hashCode;
	}
}
