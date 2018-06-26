package chapter4;

public class ArrayTest {

	public static void main(String[] args) {
		//declare : khai bao
		
		String mang1[] = new String[3];
		mang1[0] = "teacher";
		mang1[1] = "tree";
		mang1[2] = "book";
		
		//neu viet nhu duoi thi se vang exception va dung ctrinh
		//mang1[3] = "problem";
		
		int mang2[] = new int[3];
		
		//boolean mang3[] = new boolean[]
		
		//declare and assign
		String mang4[] = {"war", "dog", "banana", "peach", "mango"};
		
		System.out.println(mang1[0]);
		System.out.println(mang2[1]);
		
		//print quantity of array fourth
		System.out.println("quantity of array fourth:" +mang4.length);
		
		System.out.println("=======for loop follow index number=======");
		//print all element in array fourth, follow index number
		for(int i=0; i<mang4.length; i++) {
			System.out.println(mang4[i]);
		}
		
		System.out.println("=======for-each=======");
		//for-each
		for(String s : mang4) {
			System.out.println(s);
		}

	}

}
