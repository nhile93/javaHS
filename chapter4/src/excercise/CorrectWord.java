package excercise;
import java.util.*;
public class CorrectWord {
	String word[] = {"cellphone","television","computer","software","mouse","list","wheel","backpage","hand"};
	Scanner sc = new Scanner(System.in);
	
	public CorrectWord() {
		int a = (int)Math.round( Math.random()*word.length );
		String sl_word = word[a];
		int len = sl_word.length();
		
		System.out.println("This word have "+len+" characters");

		char[] char_array = sl_word.toCharArray();
		for(int i=0; i<char_array.length; i++) {
			int randomIndex = (int)(Math.random() * char_array.length);
			char temp = char_array[i];
			char_array[i] = char_array[randomIndex];
			char_array[randomIndex] = temp;
		}
		System.out.println(char_array);
		
		
		System.out.println("Enter correct word");
		String input_txt = sc.nextLine();

        boolean rs = input_txt.equalsIgnoreCase(sl_word);
    	
		while(rs==false) {
			System.out.println("Wrong, guess again");
			input_txt = sc.nextLine();
			rs = input_txt.equalsIgnoreCase(sl_word);
		}
		System.out.println("Correct!!!");
	}
	
	public static void main(String[] args) {
		CorrectWord cw = new CorrectWord();

	}

}
