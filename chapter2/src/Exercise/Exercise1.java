package Exercise;
import java.util.Scanner;
public class Exercise1 {
	float u,a;
	int t;
	double distance;
	
	public void calculation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter U: ");
		u=sc.nextFloat();
		System.out.println("Enter A: ");
		a=sc.nextFloat();
		System.out.println("Enter Time: ");
		t=sc.nextInt();
		
		distance = (u*t) + a * Math.pow(t,2)/2;
		System.out.println("Distance = " +distance);
	}
	
	public static void main(String[] args) {
		
		Exercise1 ex1 = new Exercise1();
		ex1.calculation();
	}

}
