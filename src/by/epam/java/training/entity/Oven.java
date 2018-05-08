package by.epam.java.training.entity;

import java.io.Serializable;

public class Oven extends KitchenAppliances implements Serializable {

    private static final long serialVersionUID = 1L;
	public static final String TAG = Oven.class.getSimpleName();
	
	private double capacity;

	private double depth;


	public Oven() {	
		super();
	}

	public Oven(int powerConsumption, double weight, double capacity, double depth, double height, double width) {
		super(powerConsumption, weight, height, width);	
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
	public static String getTAG() {
		return Oven.class.getSimpleName();
	}
        
	public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());           
                sb.append(", CAPACITY=").append(this.capacity)
			.append(", DEPTH=").append(this.depth);
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
		Oven oven = (Oven) o;
		if (Double.compare(oven.capacity, capacity) != 0) return false;
		if (Double.compare(oven.depth, depth) != 0) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = super.hashCode();
		hashCode = prime * hashCode + Double.hashCode(this.capacity);
		hashCode = prime * hashCode + Double.hashCode(this.depth);
		return hashCode;
	}
}
