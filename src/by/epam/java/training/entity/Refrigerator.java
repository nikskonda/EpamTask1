package by.epam.java.training.entity;

import java.io.Serializable;

public class Refrigerator extends KitchenAppliances implements Serializable {

	private static final long serialVersionUID = 1L;
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
	public String asString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Refrigerator ref = (Refrigerator) o;

		if (Double.compare(ref.freezerCapacity, freezerCapacity) != 0) return false;
		if (Double.compare(ref.overallCapacity, overallCapacity) != 0) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = super.hashCode();
		hashCode = prime * hashCode + Double.hashCode(this.freezerCapacity);
		hashCode = prime * hashCode + Double.hashCode(this.overallCapacity);
		return hashCode;
	}
}
