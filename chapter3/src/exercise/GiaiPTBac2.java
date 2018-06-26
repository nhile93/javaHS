package exercise;
import java.util.*;
public class GiaiPTBac2 {
	float a, b, c, x, delta, x1, x2;
	Scanner sc = new Scanner(System.in);
	public void enterData() {
		System.out.println("Nhap gia tri a: ");
		a = sc.nextFloat();
		while(a==0) {
			System.out.println("gia tri cua a phai khac 0, nhap lai gia tri a: ");
			a = sc.nextFloat();
		}
		System.out.println("Nhap gia tri b: ");
		b = sc.nextFloat();
		System.out.println("Nhap gia tri c: ");
		c = sc.nextFloat();
		
		cal();
	}
	public void cal() {
		delta = (float) Math.pow(b, 2) - 4*a*c;
		if(delta > 0) {
			System.out.println("pt co 2 nghiem phan biet:");
			x1 = -b - (float)Math.sqrt(delta)/ (2*a);
			System.out.println("Nghiem x1 = " + x1);
			x2 = -b + (float)Math.sqrt(delta)/ (2*a);
			System.out.println("Nghiem x1 = " + x2);
			if(delta < 0) {
				System.out.println("pt vo nghiem");
			}
		}
		else {
			x = (float) -b/2*a;
			System.out.println("Pt co 1 nghiem kep x1 = x2 = " + x);
		}
	}

	public static void main(String[] args) {
		GiaiPTBac2 ptb2 = new GiaiPTBac2();
		ptb2.enterData();

	}

}
