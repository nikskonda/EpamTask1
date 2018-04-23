package by.epam.java.training.entity;

public class Appliance extends Product{
	
	public static final String TAG = Appliance.class.getSimpleName();
	
	private int powerConsumption;
	
	public Appliance() {
		
	}
	
	public Appliance(int powerConsumption) {
		this.powerConsumption = powerConsumption;
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
//	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append(this.getDeviceType().toString()).append(" :")
//			.append(" POWER_CONSUMPTION=").append(this.powerConsumption)
//			.append(", WEIGHT=").append(this.weight)
//			.append(", HEIGHT=").append(this.height)
//			.append(", WIDTH=").append(this.width).append(";");
//		return sb.toString();
//	}
}
