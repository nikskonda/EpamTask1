package by.epam.java.training.entity;

public class Literature extends Product{
	
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
}
