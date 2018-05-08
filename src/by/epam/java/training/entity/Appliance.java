package by.epam.java.training.entity;

import java.io.Serializable;

public class Appliance implements Product, Serializable {

	private static final long serialVersionUID = 1L;
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
        
	public String getProprties(){
            StringBuilder sb = new StringBuilder();
            sb.append("POWER_CONSUMPTION=").append(this.powerConsumption);
            return sb.toString();
	}

	@Override
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

		Appliance appliance = (Appliance) obj;

		if (this.powerConsumption != appliance.powerConsumption) return false;

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = 1;
		hashCode = hashCode * prime + this.powerConsumption;
		return hashCode;
	}
}
