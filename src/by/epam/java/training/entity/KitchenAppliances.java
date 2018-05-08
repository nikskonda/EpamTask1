package by.epam.java.training.entity;

import java.io.Serializable;

public class KitchenAppliances extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String TAG = KitchenAppliances.class.getSimpleName();

	
	private double weight;
	private double height;
	private double width;

	public KitchenAppliances() {
		super();
	}
	
	public KitchenAppliances(int powerConsumption, double weight, double height, double width) {
		super(powerConsumption);
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
        
        public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());           
			sb.append(" WEIGHT=").append(this.weight)
			.append(", HEIGHT=").append(this.height)
			.append(", WIDTH=").append(this.width);
            return sb.toString();
        }

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

		KitchenAppliances kitchenAppliances = (KitchenAppliances) obj;

		if (Double.compare(kitchenAppliances.weight, weight) != 0) return false;
		if (Double.compare(kitchenAppliances.height, height) != 0) return false;
		if (Double.compare(kitchenAppliances.width, width) != 0) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = super.hashCode();
		hashCode = hashCode * prime + Double.hashCode(this.height);
		hashCode = hashCode * prime + Double.hashCode(this.weight);
		hashCode = hashCode * prime + Double.hashCode(this.width);
		return hashCode;
	}
}
