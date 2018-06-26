package excercise;
import java.util.*;
public class total_N_from_user {
	Scanner sc = new Scanner(System.in);
	int n, total;
	
	public void enterData() {
		
		System.out.print("Nhap so luong so muon binh phuong: ");
		n = sc.nextInt();
		while(n<=0) {
			System.out.println("N phai la so duong khac 0, ngap lai N");
			n = sc.nextInt();
		}
		for(int i=1; i<=n; i++) {
			System.out.print("nhap so thu " +i);
			int so = sc.nextInt();
			total += Math.pow(so,2);
		}
		System.out.print("Tong binh phuong N: " +total);
	}
	
	public void calculation() {
		/*
		for(int i=1; i<=n; i++) {
			System.out.println("nhap so thu " +i);
			int so = sc.nextInt();
			total += Math.pow(so,2);
		}
		System.out.print("Tong binh phuong N: " +total);
		*/
	}
	
	public static void main(String[] args) {
		total_N_from_user rs = new total_N_from_user();
		rs.enterData();
	}

}
