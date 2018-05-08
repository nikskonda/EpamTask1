package by.epam.java.training.entity;

import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable {

    private static final long serialVersionUID = 1L;
	public static final String TAG = VacuumCleaner.class.getSimpleName();
	
    private String filterType;
    
    private String bagType;
    
    private String wandType;
    
    private int motorSpeedRegulation;
    
    private int cleaningWidth;

    public VacuumCleaner() {
    	super();
    }
    
    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth){
    	super(powerConsumption);
    	this.filterType = filterType;
    	this.bagType = bagType;
    	this.wandType = wandType;
    	this.motorSpeedRegulation = motorSpeedRegulation;
    	this.cleaningWidth = cleaningWidth;    	
    }
    
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        if (motorSpeedRegulation > 0) {
            this.motorSpeedRegulation = motorSpeedRegulation;
        }
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        if (cleaningWidth > 0){
            this.cleaningWidth = cleaningWidth;
        }
    }
    
    public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());
            sb.append(", BAG_TYPE=").append(this.bagType)
		.append(", CLEANING_WIDTH=").append(this.cleaningWidth)
                .append(", FILTER_TYPE=").append(this.filterType)
                .append(", MOTOR_SPEED_REGULATION=").append(this.motorSpeedRegulation)
                .append(", WAND_TYPE=").append(this.wandType);
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
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        VacuumCleaner vc = (VacuumCleaner) o;

        if (motorSpeedRegulation != vc.motorSpeedRegulation) return false;
        if (cleaningWidth != vc.cleaningWidth) return false;

        if (this.bagType != null) {
            if (!this.bagType.equals(vc.bagType)) return false; }
        else if (vc.bagType == null) return false;

        if (this.wandType != null) {
            if (!this.wandType.equals(vc.wandType)) return false; }
        else if (vc.wandType == null) return false;

        if (this.filterType != null) {
            if (!this.filterType.equals(vc.filterType)) return false; }
        else if (vc.filterType == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + (filterType != null ? filterType.hashCode() : 0);
        hashCode = prime * hashCode + (bagType != null ? bagType.hashCode() : 0);
        hashCode = prime * hashCode + (wandType != null ? wandType.hashCode() : 0);
        hashCode = prime * hashCode + motorSpeedRegulation;
        hashCode = prime * hashCode + cleaningWidth;
        return hashCode;
    }
}
