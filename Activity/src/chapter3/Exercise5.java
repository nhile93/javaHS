package chapter3;
import java.util.*;
public class Exercise5 {
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	
	public void enter() {
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		while(num1==0 || num2==0) {
			if(num1==0) {
				System.out.println("First number be larger than 0, plz enter again");
				num1 = sc.nextInt();
			}
			else
				if(num2==0) {
					System.out.println("Second number be larger than 0, plz enter again");
					num2 = sc.nextInt();
				}
		}
		float result=(float)num1/num2;
		System.out.println("result: "+result);
	}
	
	public static void main(String[] args) {
		Exercise5 ex5 = new Exercise5();
		ex5.enter();
	}

}
