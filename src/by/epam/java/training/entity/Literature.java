package by.epam.java.training.entity;

import java.io.Serializable;

public class Literature implements Product, Serializable {

	private static final long serialVersionUID = 1L;
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
		Literature lit = (Literature) obj;
		if (this.title != null) {
			if (!this.title.equals(lit.title)) return false; }
		else if (lit.title == null) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = 1;
		hashCode = prime * hashCode + (this.title == null ? 0 : this.title.hashCode());
		return hashCode;
	}
}
