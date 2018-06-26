package chapter3;

public class ifTest {

	public static void main(String[] args) {
		int a = 7;
		int b = 6;
		if(a==b) {
			System.out.println("a = b");
		}
		else {
			if(a<b) {
				System.out.println("a < b");
			}
			else {
				System.out.println("a > b");
			}
		}

	}

}
