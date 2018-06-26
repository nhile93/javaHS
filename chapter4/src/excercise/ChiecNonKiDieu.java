package excercise;
import java.util.Scanner;
public class ChiecNonKiDieu {

	public static void main(String[] args) {
		String word = "tooth";
		
		
		System.out.println(Math.round( Math.random()*5 ));
		
		char characters [] = word.toCharArray();
		char ch[] = word.toCharArray();
		
		
		int len = word.length();
		for(int i=0; i<len; i++) {
			System.out.print(" - ");
		}
		
		System.out.println();
		System.out.println("Your choice:");
		
		Scanner sc = new Scanner(System.in);
		char choice = sc.nextLine().charAt(0);
		
		for(int i=0; i< characters.length; i++) {
			if(characters[i] == choice) {
				//System.out.print(characters[i]);
				
			}
			else {
				//System.out.print(" - ");
				ch[i] = '-';
			}
		}
		
		for(int i=0; i< ch.length; i++) {
			System.out.print(" "+ch[i] +" ");
		}
		
		System.out.println();

		boolean dung=true;
		
		while(dung)
		{
		    choice = sc.nextLine().charAt(0);
		    for(int i=0; i< ch.length; i++) {
				if(characters[i] == choice) {
					//System.out.print(characters[i]);
					ch[i] = choice;
				}
				
			}
		    for(int i=0; i< ch.length; i++) {
				System.out.print(" "+ch[i] +" ");
			}
		    
		    boolean check=true;
		    for(int i =0; i<ch.length; i++) {
		    	if(ch[i] == '-') {
		    		check=false;
		    	}
		    }
		    dung=!check;

		}
	}

}
