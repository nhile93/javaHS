package excercise;
import java.util.*;
public class CorrectWord2 {
	String word[] = {"cellphone","television","computer","software","mouse","list","wheel","backpage","hand"};
	Scanner sc = new Scanner(System.in);
	
	public CorrectWord2() {
		int a = (int)Math.round( Math.random()*word.length );
		String sl_word = word[a];
		int len = sl_word.length();
		System.out.println("This word have "+len+" characters");
	
		List<Character> list = new ArrayList<Character>();
		for(char c : sl_word.toCharArray()){
            list.add(c);
        }
		Collections.shuffle(list);
		System.out.println(list);
		
		StringBuilder output = new StringBuilder(len);
		while(list.size()!=0){
            int randPicker = (int)(Math.random()*list.size());
            output.append(list.remove(randPicker));
        }
        System.out.println(output.toString());
        
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
		CorrectWord2 sf = new CorrectWord2();
	}

}
