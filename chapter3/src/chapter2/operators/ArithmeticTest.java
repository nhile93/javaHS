package chapter2.operators;

public class ArithmeticTest {
	public void Divide() {
		int a,b;
		float c;
		a=3;
		b=2;
		c= (float) a/b;
		System.out.println("c = " +c);
	}

	public static void main(String[] args) {
		ArithmeticTest Ar = new ArithmeticTest();
		Ar.Divide();

	}

}
