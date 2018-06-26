package chapter3;

public class FORTest {

	public static void main(String[] args) {
		for(int x=0; x<=10; x+=2) {
			System.out.println(x);
					
		}
		
		for(int x=0; x<=10; x++) {
			
			if(x == 3) {
				continue;
			}
			System.out.println(x);
					
		}
	}

}
