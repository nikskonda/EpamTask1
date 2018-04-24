package by.epam.java.training.entity;

public class Laptop extends Computers {
	
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
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}
}