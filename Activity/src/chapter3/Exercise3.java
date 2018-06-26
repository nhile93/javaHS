package chapter3;
import java.util.*;
public class Exercise3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter one character");
		char cha = sc.nextLine().charAt(0);
		
		
		if(cha == 'a' || cha == 'e' || cha == 'o' || cha == 'i' || cha == 'u') {
			System.out.println("This character is vowel");
			
			
		}
		else {
			System.out.println("This character is consonant");
			
		}
		
	}
	

}
