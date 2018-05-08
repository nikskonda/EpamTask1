package by.epam.java.training.entity;

import java.io.Serializable;

public class Newspaper extends Literature implements Serializable {

    private static final long serialVersionUID = 1L;
	public static final String TAG = Newspaper.class.getSimpleName();
	
	private String periodicity;
    
    private String paidOfFree;

    public Newspaper() {
    }

    public Newspaper(String periodicity, String paidOfFree, String title) {
        super(title);
        this.periodicity = periodicity;
        this.paidOfFree = paidOfFree;
    }
    
    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getPaidOfFree() {
        return paidOfFree;
    }

    public void setPaidOfFree(String paidOfFree) {
        this.paidOfFree = paidOfFree;
    }
    
    public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());
            sb.append(", PERIODCITY=").append(this.periodicity)
                    .append(", PAID_OF_FREE=").append(this.paidOfFree);
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

        Newspaper newspaper = (Newspaper) o;

        if (this.periodicity != null) {
            if (!this.periodicity.equals(newspaper.periodicity)) return false; }
        else if (newspaper.periodicity == null) return false;

        if (this.paidOfFree != null) {
            if (!this.paidOfFree.equals(newspaper.paidOfFree)) return false; }
        else if (newspaper.paidOfFree == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + (periodicity != null ? periodicity.hashCode() : 0);
        hashCode = prime * hashCode + (paidOfFree != null ? paidOfFree.hashCode() : 0);
        return hashCode;
    }
}
