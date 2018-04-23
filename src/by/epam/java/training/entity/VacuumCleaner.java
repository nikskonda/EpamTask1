package by.epam.java.training.entity;

public class VacuumCleaner extends Appliance{

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
}
