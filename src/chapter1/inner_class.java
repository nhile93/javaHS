package chapter1;
import java.util.*;
public class inner_class {
	//variable
	public static String userName;
	public static String userPassword;
	
	//method
	public void enterData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name: ");
		userName = sc.nextLine();
		System.out.println("Enter password: ");
		userPassword = sc.nextLine();
	}
	
	//regular inner class
	class ValidateCredentials{
		
		//method
		void checkUserName() {
			if(userName ==null || userName.trim().length()==0) {
				System.out.println("User Name is required!!");
			}
		}
		
		//method
		void checkPassword() {
			if(userPassword ==null || userName.trim().length()<=5) {
				System.out.println("Password is required!!");
			}
		}
	}
	
	//static inner class
		static class Static_ValidateCredentials{
			
			//method
			void checkUserName() {
				if(userName ==null || userName.trim().length()==0) {
					System.out.println("User Name is required!!");
				}
			}
			
			//method
			void checkPassword() {
				if(userPassword ==null || userName.trim().length()<=5) {
					System.out.println("Password is required!!");
				}
			}
		}
	
	public static void main(String[] args) {
		inner_class lg = new inner_class();
		lg.enterData();
		//regular inner class
		inner_class.ValidateCredentials obj = lg.new ValidateCredentials();
		obj.checkUserName();
		obj.checkPassword();
		
		//static inner class
		inner_class.Static_ValidateCredentials sobj = new inner_class.Static_ValidateCredentials();
		sobj.checkPassword();
		sobj.checkUserName();

	}

}
