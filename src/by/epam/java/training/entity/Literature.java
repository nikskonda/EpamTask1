package by.epam.java.training.entity;

public class Literature implements Product{
	
	public static final String TAG = Literature.class.getSimpleName();
	
	private String title;
	
	public Literature() {
	}
	
	public Literature(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
        
        public String getProprties(){
            StringBuilder sb = new StringBuilder();
            sb.append("TITLE=").append(this.title);			
            return sb.toString();
        }
        
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}
}
