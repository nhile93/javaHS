package chapter5;

public class Book extends Document {
//	private String title, author;
//	private int nPages;
	
	protected String title, author;
	protected int nPages;
	
	public Book() {
		title = "java";
		author = "Kevin";
		nPages = 100;
	}
	public void displayDetail() {
		System.out.println("=== Book ===");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Pages:  " + nPages);
	}
	
	void display() {}
}
