package concepts;

public class Constructor {
	//variables
	String name;
	int age = 20;
	
	//this is constructor has 4 meaning:
	//1. public
	//2. no return type
	//3. same name with class
	//4. auto run when instance object (new)
	
	//constructor without parameter
	public Constructor() {
		System.out.println("constructor.....");
	}
	
	//constructor with parameter
	public Constructor(String name) {
		this.name = name;
		System.out.println("constructor with parameter: "+this.name);
	}
	
	//constructor with multiple parameter
	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name: "+this.name + "and age: " + this.age);
	}
	
	
	//normal method
	public void Constructor() {
		System.out.println("normal method.");
	}
	
	public static void main(String[] args) {
		//without parameter
		Constructor c = new Constructor();
		
		//with parameter
		Constructor t = new Constructor("nitt");
		
		//with multiple parameter
		Constructor r = new Constructor("nitt", 25);
		
		//call normal
		c.Constructor();

	}

}
