package basics;

public class Example2 extends Ex{
	
	int i=11;
	static int j=22;
	
	Example2(){
		System.out.println("Constructor - Sub class");
		System.out.println("Accessing from Instance method");
		Example2 ex=new Example2();
		System.out.println("Accessing instance"+ex.i);
		System.out.println("Accessing instance"+ex.j);
		System.out.println("Try to access Parent members using super");
		System.out.println("Accessing instance"+super.i);
		System.out.println("Accessing instance"+super.j);
	}
	
	{
	System.out.println("Instance block  - Sub class");
	System.out.println("Accessing from Instance method");
	Example2 ex=new Example2();
	System.out.println("Accessing instance"+ex.i);
	System.out.println("Accessing instance"+ex.j);
	System.out.println("Try to access Parent members using super");
	System.out.println("Accessing instance"+super.i);
	System.out.println("Accessing instance"+super.j);
	}
	
	
	static
	{
		System.out.println("Static block  - Sub class");
		System.out.println("Accessing from Instance method");
		Example2 ex=new Example2();
		System.out.println("Accessing instance"+ex.i);
		System.out.println("Accessing instance"+ex.j);
		System.out.println("Try to access Parent members using super");
		//System.out.println("Accessing instance"+super.i);
		//System.out.println("Accessing instance"+super.j);
		System.out.println("Gives error cant use super in static block");
	}
	
	void add1(){
		System.out.println("Instance - Sub class");
		System.out.println("Accessing from Instance method");
		Example2 ex=new Example2();
		System.out.println("Accessing instance"+ex.i);
		System.out.println("Accessing instance"+ex.j);
		System.out.println("Try to access Parent members using super");
		System.out.println("Accessing instance"+super.i);
		System.out.println("Accessing instance"+super.j);
	}
	static void sub1(){
		System.out.println("Static - Sub class");
		System.out.println("Instance - Sub class");
		System.out.println("Accessing from Instance method");
		Example2 ex=new Example2();
		System.out.println("Accessing instance"+ex.i);
		System.out.println("Accessing instance"+ex.j);
		System.out.println("Try to access Parent members using super");
		//System.out.println("Accessing instance"+super.i);
		//System.out.println("Accessing instance"+super.j);
		System.out.println("Cant use super keyword in static method");
	}


	public static void main(String[] args) {
	System.out.println("Accessing from main method");
	Example2 ex=new Example2();
	System.out.println("Accessing instance"+ex.i);
	System.out.println("Accessing instance"+ex.j);
	System.out.println("Try to access Parent members using super");
	//System.out.println("Accessing instance"+super.i);
	//System.out.println("Accessing instance"+super.j);
	System.out.println("Cant access - giving error - in static method cant use super keyword");
	
	System.out.println("********Accessing from instance method********");
	ex.add1();
	
	System.out.println("********Accessing from static method********");
	Example2.sub1();
	}

}

class Ex{
	int i=1;
	//static int i=2; - Cant create variable with same for as instance and static
	static int j=2;
	void add(){
		System.out.println("Instance - Parent class");
	}
	static void sub(){
		System.out.println("Static - Parent class");
	}
	
}
