package chapter2.operators;

public class AssignmentTest {
	public void Complex() {
		int x,y,z;
		x=7; y=9;
		
		x+=y;// x= x+y=16 the x+y=16+9=25
		
		z=x+y;
		System.out.println("z = " + z);
	}

	public static void main(String[] args) {
		AssignmentTest Ass = new AssignmentTest();
		Ass.Complex();

	}
}
