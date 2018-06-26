package chapter5;

public class SoftWare_Book extends Book {
	
	private String category = "Soft";
	
	public void displayDetail() {
		System.out.println("=== Soft Ware Book ===");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Pages:  " + nPages);
		System.out.println("Category:  " + category);
	}
	
	public void downloadCode() {
		System.out.println("Download code here . . ..... . . ");
	}
}
