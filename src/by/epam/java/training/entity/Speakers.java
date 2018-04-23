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
}
