package chapter3;
import java.util.*;
public class Exercise4 {

	public void nhap() {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(check(i)) {
				System.out.print(i + " ");
			}
		}

	}
	
	public boolean check(int so) {
		boolean ch = true;
		for(int i=2; i<=so-1; i++) {
			
			if(so % i == 0) {
				ch = false; 
				break;
			}
		}
		
		return ch; //chi true khi no la so nguyen to,
	}
	
	public static void main(String[] args) {
		Exercise4 ex = new Exercise4();
		ex.nhap();
	}

}
