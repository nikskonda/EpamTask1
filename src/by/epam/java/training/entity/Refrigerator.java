package by.epam.java.training.entity;

public class Refrigerator extends KitchenAppliances{
	
	public static final String TAG = Refrigerator.class.getSimpleName();
	
	private double freezerCapacity;

	private double overallCapacity;

	public Refrigerator() {
		super();
	}

	public Refrigerator(int powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
		super(powerConsumption, weight, height, width);
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
	
        public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());
            sb.append(", FREEZER_CAPACITY=").append(this.freezerCapacity)
			.append(", OVERALL_CAPACITY=").append(this.overallCapacity);
            return sb.toString();
        }
        
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}
       
}
