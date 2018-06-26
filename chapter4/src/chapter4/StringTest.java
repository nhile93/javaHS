package chapter4;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Bye";
		
		int a = s1.length();
		System.out.println(a);
		
		char[] b = s1.toCharArray();
		for(char c : b) {
			System.out.println(c);
		}
		
		char rs = s1.charAt(2);
		System.out.println(rs);
		
		System.out.println(s1.indexOf('l'));
		
		System.out.println(s1.lastIndexOf('l'));
		
		int result = s2.compareTo(s1);
		System.out.println(result);
		
		//
		char c='/';
		System.out.println((int)c);
		
	}

}
