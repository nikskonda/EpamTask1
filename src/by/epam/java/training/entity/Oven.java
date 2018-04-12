package by.epam.java.training.entity;



public class Oven extends Appliance {

	private double capacity;

	private double depth;


	public Oven() {
		super(Device.Oven);
	}

	public Oven(int powerConsumption, double weight, double capacity, double depth, double height, double width) {
		super(Device.Oven,powerConsumption, weight, height, width);	
		this.capacity = capacity;
		this.depth = depth;
		
	}

	public double getCapacity() {
		return this.capacity;
	}

	public void setCapacity(double capacity) {
		if (capacity > 0) {
			this.capacity = capacity;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		if (depth > 0) {
			this.depth = depth;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getDeviceType().toString()).append(" :")
			.append(" POWER_CONSUMPTION=").append(super.getPowerConsumption())
			.append(", WEIGHT=").append(super.getWeight())
			.append(", CAPACITY=").append(this.capacity)
			.append(", DEPTH=").append(this.depth)
			.append(", HEIGHT=").append(super.getHeight())
			.append(", WIDTH=").append(super.getWeight()).append(";");
		return sb.toString();
	}
}
