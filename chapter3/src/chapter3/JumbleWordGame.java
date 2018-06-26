package chapter3;
import java.util.*;
public class JumbleWordGame {
	//Variables
	int choice;
	
	//Methods
	public void menu() {
		System.out.println("=============Jumble Word Game=============");
		System.out.println("1. Play Game");
		System.out.println("2. View Instruction");
		System.out.println("3. Exit");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		//code here
		
			do {
				switch(choice) {
					case 1: playGame();
							choice = sc.nextInt(); break;
					case 2: instruction(); 
							choice = sc.nextInt();break;
					case 3: exit(); 
							choice = 5; break;
					default: if(choice == 5)
					{
						break;
						
					}else
					{        System.out.println("Nhap sai, nhap lai tu 1 den 3");
					         choice = sc.nextInt();
					}
				}
			}
			while(choice >0 || choice <4);
	}
	
	public void playGame() {System.out.println("starting game");}
	
	public void instruction() {System.out.println("instruction.........");}
	
	public void exit() {System.out.println("bye bye");}
	
	public static void main(String[] args) {
		JumbleWordGame game = new JumbleWordGame();
		game.menu();

	}

}
