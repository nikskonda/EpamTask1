package by.epam.java.training.entity;

public class Refrigerator extends Appliance{

	private double freezerCapacity;

	private double overallCapacity;


	public Refrigerator() {
		super(Device.Refrigerator);
	}

	public Refrigerator(int powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
		super(Device.Refrigerator, powerConsumption, weight, height, width);
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
	}

	

	public double getFreezerCapacity() {
		return this.freezerCapacity;
	}

	public void setFreezerCapacity(double freezerCapacity) {
		if (freezerCapacity > 0) {
			this.freezerCapacity = freezerCapacity;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getOverallCapacity() {
		return this.overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		if (overallCapacity > 0) {
			this.overallCapacity = overallCapacity;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDeviceType().toString()).append(" :")
			.append(" POWER_CONSUMPTION=").append(super.getPowerConsumption())
			.append(", WEIGHT=").append(super.getWeight())
			.append(", FREEZER_CAPACITY=").append(this.freezerCapacity)
			.append(", OVERALL_CAPACITY=").append(this.overallCapacity)
			.append(", HEIGHT=").append(super.getHeight())
			.append(", WIDTH=").append(super.getWidth()).append(";");
		return sb.toString();
	}
}