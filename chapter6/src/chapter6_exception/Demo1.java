package chapter6_exception;

import java.util.Scanner;

public class Demo1 {

	public void div() {
		
		int a, b,c;
		
		System.out.println("Enter a,b");
		Scanner sc =new Scanner(System.in);
		
		a =sc.nextInt();
		b = sc.nextInt();
		
		c = a/b;
		
		System.out.println("Result: " + c);
				
	}
		
	public void div_try() {
		
		
		int a, b,c;
		
		System.out.println("Enter a,b");
		Scanner sc =new Scanner(System.in);
		
		try {
			a =sc.nextInt();
			b = sc.nextInt();
			
			c = a/b;
			
			System.out.println("Result: " + c);
		}
		catch (ArithmeticException ex1) {
			//
			
			System.out.println("Kiem tra lai gia tri da nhap"+ ex1.getMessage() );
			
		}
		
		
	}
	
	public void div_try2() {
		
		
		short a, b,c;
		
		System.out.println("Enter a,b");
		Scanner sc =new Scanner(System.in);
		
		try {
			
			
			String sa = sc.nextLine();
			a =Short.parseShort(sa);
			
			String sb = sc.nextLine();
			b =Short.parseShort(sb);
			
			c = (short)(a/b);
			
			
			
			System.out.println("Result: " + c);
		}
		catch (NumberFormatException ex1) {
			//
			
			System.out.println("Kiem tra lai gia tri da nhap"+ ex1.getMessage() );
			
		}
		
		
	}
	
   public void div_try3() {
		
		
		int a, b,c;
		
		System.out.println("Enter a,b");
		Scanner sc =new Scanner(System.in);
		
		try {
			
			
			String sa = sc.nextLine();
			a =Integer.parseInt(sa);
			
			String sb = sc.nextLine();
			b =Integer.parseInt(sb);
			
			a =  2147483647;
			
			b =a+2;
			
			System.out.println("b: " + b);
			
			c = (a)/b;
			
			System.out.println("Result: " + c);
		}
		catch (NumberFormatException ex1) {
			//
			
			System.out.println("a, b phai la con so"+ ex1.getMessage() );
			
		}
		catch (ArithmeticException ex2) {
			//
			
			System.out.println("b phai khac 0"+ ex2.getMessage() );
			
		}
		
	}
	
   
   public void div_try4() {
		
		
		int a, c;
		byte b;
		
		System.out.println("Enter a,b");
		Scanner sc =new Scanner(System.in);
		
		try {
			
			a =  2147483647;
			
			b =(byte)( a+2);
			
			System.out.println("b: " + b);
			
			c = (a)/b;
			
			System.out.println("Result: " + c);
		}
		catch (ArithmeticException ex2) {
			//
			
			System.out.println("b phai khac 0"+ ex2.getMessage() );
			
		}
		catch (NumberFormatException ex1) {
			//
			
			System.out.println("a, b phai la con so"+ ex1.getMessage() );
			
		}
		
		catch (Exception ex3) {
			//
			
			System.out.println("unknown"+ ex3.getMessage() );
			
		}
		
	}
   
   public int test() {
	   int x =9;
	   switch (x) {
	   		case 1: System.out.println("x =1");
	   		//return 1 //error
	   		break;

		default:
			break;
	}
	   
	   System.out.println("End of here");
	   
	   return 1;
	   
   }
	public static void main(String[] args) {
		
		Demo1 d =new Demo1();
		d.div_try4();
		

	}

}
