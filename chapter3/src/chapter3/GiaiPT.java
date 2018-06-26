package chapter3;
import java.util.*;
public class GiaiPT {
	//ax + b = 0
	int a,b;
	float x;
	
	public void enterData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri a: ");
		a = sc.nextInt();
		System.out.println("Nhap gia tri b: ");
		b = sc.nextInt();
	}
	public void cal() {
		//TH 1 a=0, b=0
		if(a==0) {
			if(b==0) {
				System.out.println("pt vo so nghiem");
			}
			else{
				System.out.println("pt vo nghiem ");
			}
		}
		else {
			x = (float)-b/a;
			System.out.println("pt co nghiem: " + x);
		}
	}
	public static void main(String[] args) {
		GiaiPT rs = new GiaiPT();
		rs.enterData();
		rs.cal();

	}

}
