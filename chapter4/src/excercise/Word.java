package excercise;
import java.util.Scanner;
public class Word {

	public static void main(String[] args) {
		String words[][] = new String[5][2];
		Scanner sc = new Scanner(System.in);
		
		//input
		for(int i=0; i<5; i++) {
			System.out.println("Enter word:");
			words[i][0] = sc.nextLine();
			System.out.println("Enter right word:");
			words[i][1] = sc.nextLine();
		}
		
		//output
		for(int i=0; i<5; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(words[i][j] + " > ");
			}
			System.out.println();
		}
	}

}
