package by.epam.java.training.entity;

import java.io.Serializable;

public class TextBook extends Literature implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String TAG = TextBook.class.getSimpleName();
	
	private String subject;
	
	private String author;
	
	private int numberOfPages; 

    public TextBook() {
    }

    public TextBook(String subject, String author, int numberOfPages, String title) {
        super(title);
        this.subject = subject;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
        
        
        
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
	
    public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());
            sb.append(", AUTHOR=").append(this.author)
                    .append(", SUBJECT=").append(this.subject)
                    .append(", NUMBER_OF_PAGES=").append(this.numberOfPages);
            return sb.toString();
        }
        
	@Override
	public String asString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        TextBook textBook = (TextBook) obj;

        if (numberOfPages != textBook.numberOfPages) return false;

        if (this.author != null) {
            if (!this.author.equals(textBook.author)) return false; }
        else if (textBook.author == null) return false;

        if (this.subject != null) {
            if (!this.subject.equals(textBook.subject)) return false; }
        else if (textBook.subject == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + (subject != null ? subject.hashCode() : 0);
        hashCode = prime * hashCode + (author != null ? author.hashCode() : 0);
        hashCode = prime * hashCode + numberOfPages;
        return hashCode;
    }
}
