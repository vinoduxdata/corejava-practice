package Loops;

public class Example extends Example2 {
Example(){
	System.out.println("Sub class 2 constructor");
}

{
	System.out.println("sub class 2 initializer");
}

static {
	System.out.println("sub class 2 static initializer");
}

public static void main(String[] args) {
	Example ex=new Example();
}
}

class Example2 extends  Example3
{
	Example2(){
		System.out.println("SUb class 1 constructor");
	}
	{
		System.out.println("SUb class 1 Initializer");
	}
	
	static {
		System.out.println("SUb class 1 static initializer");
	}
	
}

class Example3 
{
	Example3(){
		System.out.println("Super class constructor");
	}
	{
		System.out.println("Super class Initializer");
	}
	
	static {
		System.out.println("super class static initializer");
	}
	
}


