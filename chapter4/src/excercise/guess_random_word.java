package excercise;
import java.util.Scanner;
public class guess_random_word {
	String word[] = {"word","teacher","student","computer","star","telephone"};
	Scanner sc = new Scanner(System.in);
	
	public guess_random_word() {
		int a = (int)Math.round( Math.random()*word.length );
		String sl_word = word[a];
		
		char characters[] = sl_word.toCharArray();
		char ch[] = sl_word.toCharArray();
		
		int len = sl_word.length();
		System.out.println("The word have " +len + " letters");
		for(int i=0; i<len; i++) {
			System.out.print(" - ");
		}
		
		char choice = sc.nextLine().charAt(0);
		int count=0;
		//run first time
		for(int i=0; i<len; i++) {
			
			if(characters[i] == choice) {
				ch[i] = choice;	
				count++;
			}
			else {
				ch[i] = '-';
			}
			
		}
		for(int i=0; i<ch.length; i++) {
			System.out.print(" "+ch[i] +" ");
		}
		
		switch(count){
			case 1:System.out.println("have one " + choice + " character"); break;
			case 2: System.out.println("have two " + choice + " characters"); break;
			case 3: System.out.println("have three " + choice + " characters"); break;
			case 4: System.out.println("have four " + choice + " characters"); break;
			case 5: System.out.println("have five " + choice + " characters"); break;
			default: System.out.println("Sorry, we no have " + choice +" please guess other character"); break;
		}
		
		//run for other
		boolean stop=true;
		while(stop){
			int count2=0;
			choice = sc.nextLine().charAt(0);
			for(int i=0; i<ch.length; i++) {
				if(characters[i] == choice) {
					ch[i] = choice;
					count2++;
				}
			}
			for(int i=0; i<ch.length; i++) {
				System.out.print(" "+ch[i] +" ");
			}
			switch(count2){
				case 1:System.out.println("Have one " + choice + " character"); break;
				case 2: System.out.println("Have two " + choice + " characters"); break;
				case 3: System.out.println("Have three " + choice + " characters"); break;
				case 4: System.out.println("Have four " + choice + " characters"); break;
				default: System.out.println("Sorry, we no have " + choice +" please guess other character"); break;
			}
			//finish game:
			boolean inner_stop = true;
			for(int i=0; i<ch.length; i++) {
				if(ch[i] == '-') {
					inner_stop = false;
				}
			}
			stop =! inner_stop;
		}
	}
	
	public static void main(String[] args) {
		guess_random_word cnkd = new guess_random_word();
		System.out.println();
		System.out.println("You are win!!!!!");
	}

}
