package by.epam.java.training.entity;

import java.io.Serializable;

public class Laptop extends Computers implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String TAG = Laptop.class.getSimpleName();
	
	private String os;

	private int systemMemory;

	private double cpu;


	public Laptop() {
		
	}

	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, double displayInchs) {
		super(batteryCapacity, memoryRom, displayInchs);
		this.os = os;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
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

	public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());
            sb.append(", OS=").append(this.os.toString())
			.append(", SYSTEM_MEMORY=").append(this.systemMemory)
			.append(", CPU=").append(this.cpu);
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
		if (!super.equals(obj)) return false;

		Laptop laptop = (Laptop) obj;

		if (systemMemory != laptop.systemMemory) return false;
		if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (this.os != null) {
            if (!this.os.equals(laptop.os)) return false; }
        else if (laptop.os == null) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = super.hashCode();
		hashCode = prime * hashCode + (os != null ? os.hashCode() : 0);
		hashCode = prime * hashCode + systemMemory;
		hashCode = prime * hashCode + Double.hashCode(this.cpu);
		return hashCode;
	}



}