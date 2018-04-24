package by.epam.java.training.entity;

public class TextBook extends Literature{
	
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
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}
}
