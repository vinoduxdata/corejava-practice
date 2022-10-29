package basics;

public class Example {
	
	//Instance data member
	int i=5;
	
	//Static data member
	static int j=10;

	
	//Constructor is public by default 
	public Example() {
	System.out.println("Constructor");
	}
	
	
	//Static block
	static{
		System.out.println("Static Block");
	}
	
	
	//Instance block 
	{
		System.out.println("Instance Block");
	}
	
	//Static method
	static void add(){
		System.out.println("Static Method");
	}
	
	//Instance method
	 void sub(){
		System.out.println("Instance Method");
	}
	 public static void main(String[] args) {
		System.out.println("**********Starting main method******");
		System.out.println("*********Object Creation**********");
		Example ex=new Example();
		System.out.println("Accessing static members- No need to create object");
		System.out.println("Accessed using Class reference");
		System.out.println("----------------------------");
		System.out.println(Example.j);
		Example.add();
		System.out.println("******************************");
		System.out.println("Accessing instance members- Must create object");
		System.out.println("Accessed using object reference");
		System.out.println("----------------------------");
		System.out.println(ex.i);
		ex.sub();	
	}

}
