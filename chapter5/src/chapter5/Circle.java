package chapter5;

public class Circle extends Shape {
	int r, x, y;
	@Override
	void draw() {
		System.out.println("Ve hinh tron");
		System.out.println("Border color" + border_color);
		System.out.println("Border color" + border_fill);
		
	}
}
