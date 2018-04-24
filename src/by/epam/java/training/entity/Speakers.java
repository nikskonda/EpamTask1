package by.epam.java.training.entity;

public class Speakers extends Appliance{
	
	public static final String TAG = Speakers.class.getSimpleName();
	
	private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    	super();
    }
    
    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
    	super(powerConsumption);
    	this.numberOfSpeakers = numberOfSpeakers;
    	this.frequencyRange = frequencyRange;
    	this.cordLength = cordLength;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        if (numberOfSpeakers > 0) {
            this.numberOfSpeakers = numberOfSpeakers;
        }
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        if (cordLength > 0) {
            this.cordLength = cordLength;
        }
    }
    
    public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());
            sb.append(", NUMBER_OF_SPEAKERS=").append(this.numberOfSpeakers)
                .append(", CORD_LENGTH=").append(this.cordLength)
                .append(", FREQUENCY_RANGE=").append(this.frequencyRange);
            return sb.toString();
        }
        
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}
}
