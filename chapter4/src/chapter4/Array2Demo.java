package chapter4;

public class Array2Demo {

	public static void main(String[] args) {
		char mang1[][] = new char[3][3];
		
		mang1[0][0] = 'X';
		mang1[0][1] = 'X';
		mang1[0][2] = 'O';
		mang1[1][1] = 'O';
		mang1[2][0] = 'X';
		mang1[2][1] = 'O';
		
		System.out.println("=======");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(mang1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
