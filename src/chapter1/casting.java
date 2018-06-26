package chapter1;

public class casting {

	public static void main(String[] args) {
		int a = 100;
		long b = a;
		System.out.println(a);
		System.out.println(b);
		
		long c = 100;
		//int d = c;
		int d = (int)c;
		System.out.println(d);
	}

}
