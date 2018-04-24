package by.epam.java.training.entity;

public class Newspaper extends Literature{
	
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
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}
}
