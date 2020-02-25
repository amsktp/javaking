package library;

public class Book {

	private String title = "";
	private String writer = "";
	private String publisher = "";
	private int price = 0;
	private int writeDate = 0;
	
	Book(){
		
	}

	public Book(String title, String writer, String publisher, int price, int writeDate) {
		super();
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.writeDate = writeDate;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getWriteDate() {
		return writeDate;
	}
	
	public void setWriteDate(int writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", publisher=" + publisher + ", price=" + price
				+ ", writeDate=" + writeDate + "]";
	}




	
	
	
}
