package by.epam.java.training.entity;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable {

    private static final long serialVersionUID = 1L;
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

        Speakers speakers = (Speakers) o;

        if (numberOfSpeakers != speakers.numberOfSpeakers) return false;
        if (cordLength != speakers.cordLength) return false;

        if (this.frequencyRange != null) {
            if (!this.frequencyRange.equals(speakers.frequencyRange)) return false; }
        else if (speakers.frequencyRange == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + this.numberOfSpeakers;
        hashCode = prime * hashCode + (this.frequencyRange != null ? frequencyRange.hashCode() : 0);
        hashCode = prime * hashCode + this.cordLength;
        return hashCode;
    }
}
