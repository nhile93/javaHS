package chapter4;
import java.util.*;
public class HangmanGame {
	
	String word[] = {"japan","qatar","syria","mongolia","bahrain","india","china"};
	
	public void playGame() {
		int len, i, count=0, rnd, flag=0;
		String choice, temp;
		
		Random rd = new Random();
		Scanner input = new Scanner(System.in);
		rnd = rd.nextInt(6);
		
		len = word[rnd].length();
		char[] newString = new char[len];
		
		StringBuffer wrgString = new StringBuffer();
		for(int j=0; j<len; j++) {
			System.out.print("_ ");
		}
		System.out.println();
		
		do {
			System.out.print("Enter your guess: ");
			String ch = input.nextLine().toLowerCase();
			count ++;
			for(i=0; i<len; i++) {
				
			}
		}while(flag!=0);
		
	}
	public HangmanGame() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
