package CyberLibrary;

public class Book {
	
	private String bookName;
	private String bookWriter;
	private String company;
	private String type;
//	private int rate;

	public Book() {}
	
	public Book(String bookName, String bookWriter, String company, String type) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.company = company;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return bookName+" | "+bookWriter+" | "+company+
				" | " + type;
	}

	//getter/setter
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
