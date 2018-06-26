package chapter5_GUI;

public class Book {
	String authorName, title;
	float price;
	int numofpages;
	
	public Book() {}
	
	public Book(String name, String titlle, float price, int numofpages) {
		this.authorName = name;
		this.title = title;
		this.price = price;;
		this.numofpages = numofpages;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public float getPrice() {
		return price;
	}
	public int getNumofpages() {
		return numofpages;
	}
}
class SoftWareBook2 extends Book {
	String version, swName;
	public SoftWareBook2(String titlle, String name, float price, int numofpages, String version, String swName) {
		this.authorName = name;
		this.title = title;
		this.price = price;;
		this.numofpages = numofpages;
		this.version = version;
		this.swName = swName;
	}
	public String getVersion() {
		return version;
	}
	public String getSwname() {
		return swName;
	}
}
class HardWareBook extends Book {
	String hwCategory,publisher;
	
	public HardWareBook(String titlle, String name, float price, int numofpages, String hwCategory, String publisher) {
		this.authorName = name;
		this.title = title;
		this.price = price;;
		this.numofpages = numofpages;
		this.hwCategory = hwCategory;
		this.publisher = publisher;
	}
	public String getHwCategory() {
		return hwCategory;
	}
	public String getPublisher() {
		return publisher;
	}
}
