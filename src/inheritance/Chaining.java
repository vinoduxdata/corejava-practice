package inheritance;

public class Chaining extends Ex {

	public Chaining(int i) {
		super(2.2);
		System.out.println("Parameterized Constructor - Sub Class - Not a default one");
	}
	
	
	public static void main(String[] args) {
	Chaining ol=new  Chaining(2);
	
	}

}

class Ex {
	
	//Constructor overloading 
	Ex(){
		System.out.println("Default Constructor - Super Class");
	}
	

	
	Ex(double i){
		System.out.println("You forcefully called other constructor than default constructor");
	}
	
	{
		System.out.println("Instance block  - Super Class");	
	}
	static{
		System.out.println("Static block  - Super Class");
	}
}
