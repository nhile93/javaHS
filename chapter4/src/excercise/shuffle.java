package excercise;

public class shuffle {

	public shuffle() {
		
	}

	public static void main(String[] args) {
		String text="system";
		String txt_compare="happy";
		char[] characters = text.toCharArray();
	    for (int i = 0; i < characters.length; i++) {
	        int randomIndex = (int)(Math.random() * characters.length);
	        char temp = characters[i];
	        characters[i] = characters[randomIndex];
	        characters[randomIndex] = temp;
	    }
	    System.out.println(characters);
	    System.out.println(characters.toString().equalsIgnoreCase(txt_compare));
	}

}
