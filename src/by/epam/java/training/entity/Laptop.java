package by.epam.java.training.entity;

public class Laptop extends Item {

	private double batteryCapacity;

	private String os;

	private int memoryRom;

	private int systemMemory;

	private double cpu;

	private double displayInchs;

	public Laptop() {
		super(Device.Laptop);
	}

	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, double displayInchs) {
		super(Device.Laptop);
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
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

	public String getOS() {
		return this.os;
	}

	public void setOS(String os) {
		if (os != null) {
			this.os = os;
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

	public int getSystemMemory() {
		return this.systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		if (systemMemory > 0) {
			this.systemMemory = systemMemory;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getCPU() {
		return this.cpu;
	}

	public void setCPU(double cpu) {
		if (cpu > 0) {
			this.cpu = cpu;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getDisplayInchs() {
		return this.displayInchs;
	}

	public void setDisplayInchs(double displayInchs) {
		if (displayInchs > 0) {
			this.displayInchs = displayInchs;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDeviceType().toString()).append(" :")
			.append(" BATTERY_CAPACITY=").append(this.batteryCapacity)
			.append(", OS=").append(this.os)
			.append(", MEMORY_ROM=").append(this.memoryRom)
			.append(", SYSTEM_MEMORY=").append(this.systemMemory)
			.append(", CPU=").append(this.cpu)
			.append(", DISPLAY_INCHS=").append(this.displayInchs).append(";");
		return sb.toString();
	}
}