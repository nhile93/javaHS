package chapter2.operators;

public class ComparisionTest {
	public void Complex() {
		int x,y,z;
		x=7; y=9;
		
		x+=y;// x= x+y=16 the x+y=16+9=25
		
		z=x+y;
		System.out.println("z = " + z);
	}

	public static void main(String[] args) {
		ComparisionTest comp = new ComparisionTest();
		comp.Complex();

	}
}
