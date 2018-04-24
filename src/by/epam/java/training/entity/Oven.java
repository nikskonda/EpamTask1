package by.epam.java.training.entity;

public class Oven extends KitchenAppliances {

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
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}

}
