package excercise;
import java.util.*;
public class total_N {
	Scanner sc = new Scanner(System.in);
	int n, total;
	
	public void enterData() {
		System.out.println("Nhap N: ");
		n = sc.nextInt();
		
		do {
			System.out.println("N phai la so duong khac 0, ngap lai N");
			n = sc.nextInt();
		}
		while(n<=0);
		
	}
	
	public void calculate() {
		for(int i=1 ; i<=n; i++) {
			total += Math.pow(i, 2);
		}
		System.out.println("Tong binh phuong N: " +total);
	}
	
	
	public static void main(String[] args) {
		total_N rs = new total_N();
		rs.enterData();
		rs.calculate();
	}

}
