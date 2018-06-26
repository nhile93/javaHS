package chapter4;

public class EnumsTest {

	enum GAMELEVEL {LEVEL1, LEVEL2, LEVEL3};
	
	enum SCHOOL {COMPUTER(21), ARCHITECTURE(19);
		private int mark;
		SCHOOL(int mark){
			this.mark = mark;
		}
		int getMark() {
			return mark;
		}
	};
	
	
	GAMELEVEL level;
	SCHOOL m1;
	public EnumsTest() {
		//assign value
		level = GAMELEVEL.LEVEL1;
		System.out.println("your level: " + level);
		
		//school demo
		m1 = SCHOOL.COMPUTER;
		System.out.println("your program: " + m1);
		System.out.println("mark: " + m1.getMark());
		
	}
	public void getValue() {
		for(GAMELEVEL l : GAMELEVEL.values()) {
			System.out.println("your level: " + l);
		}
	}
	public static void main(String[] args) {
		EnumsTest t = new EnumsTest();
		t.getValue();
	}

}
