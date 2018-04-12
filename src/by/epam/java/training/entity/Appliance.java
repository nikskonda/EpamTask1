package by.epam.java.training.entity;

public class Appliance extends Item{
	
	private int powerConsumption;
	
	private double weight;

	private double height;

	private double width;
	
	public Appliance() {
		super(Device.Appliance);
	}
	
	public Appliance(Device deviceType) {
		super(deviceType);
	}
	
	public Appliance(int powerConsumption, double weight, double height, double width) {
		super(Device.Appliance);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}
	
	public Appliance(Device deviceType, int powerConsumption, double weight, double height, double width) {
		super(deviceType);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}
	
	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getPowerConsumption() {
		return this.powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		if (powerConsumption > 0) {
			this.powerConsumption = powerConsumption;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDeviceType().toString()).append(" :")
			.append(" POWER_CONSUMPTION=").append(this.powerConsumption)
			.append(", WEIGHT=").append(this.weight)
			.append(", HEIGHT=").append(this.height)
			.append(", WIDTH=").append(this.width).append(";");
		return sb.toString();
	}
}
