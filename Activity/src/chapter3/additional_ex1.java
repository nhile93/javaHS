package chapter3;
import java.util.*;
public class additional_ex1 {
	Scanner sc = new Scanner(System.in);
	int n;

	public additional_ex1() {
		System.out.println("What your number table you want to show: ");
		n = sc.nextInt();
		
		while(n==0 || n<0) {
			System.out.println("Number table show be a positivie number, plz choice again: ");
			n = sc.nextInt();
		}
		for(int i=1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " +n*i);
			
		}
	}
	public static void main(String[] args) {
		additional_ex1 ex = new additional_ex1();
	}

}
