package excercise;
import java.util.Scanner;
public class full_square {
	Scanner sc = new Scanner(System.in);
	int n;
	
	public void enterData() {
		System.out.print("Nhap kich thuoc hinh vuong");
		n = sc.nextInt();
		do {
			System.out.println("Kick thuoc hinh vuong phai la so nguyen duong khac 0 \nVui long nhap lai kich thuoc");
			n = sc.nextInt();
		}
		while(n<=0);
	}
	
	public void calculation() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		
		full_square fs = new full_square();
		fs.enterData();
		fs.calculation();

	}

}
