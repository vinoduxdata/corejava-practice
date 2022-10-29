package abstraction;

abstract class C1 {
	
	//We can write constructor in Abstract class but it wont run
	//bcz we cant create object of abstract class
	C1(){
		System.out.println("Constructor - C1");
	}
	
	//Static block 
	static {
		System.out.println("Static block - C1");
	}
	
	//We can write Instance Block in Abstract class but it wont execute
		//bcz we cant create object of abstract class
		{
			System.out.println("Instance block - C1");
		}
		
	// abstract method - without body
	abstract void m1();
	
	
	//Normal or Concrete method
	void add(){
		
	}
	
}

// ---------------------------------------------

class C2 extends C1 {
	
	@Override
	void m1() {

	}
	
	//Can write constructor and it gets executed once object is created
	C2(){
		System.out.println("Constructor - C2");
	}
	
	//Static Block
		static {
			System.out.println("Static Block - C2");
		}
		
	
	//Can write Instance block and it gets executed once object is created
	{
		System.out.println("Instance Block - C2");
	}

	// Normal or Concrete method with Body
	void sub() {
	}
}

// -------------------------------------------

abstract class C3 extends C2 {

	//We can write constructor in Abstract class but it wont run
		//bcz we cant create object of abstract class
		C3(){
			System.out.println("Constructor - C3");
		}
		
		//Static block 
		static {
			System.out.println("Static block - C3");
		}
		
		//We can write Instance Block in Abstract class but it wont execute
			//bcz we cant create object of abstract class
			{
				System.out.println("Instance Block - C3");
			}
			
		// abstract method - without body
		abstract void m3();
		
		
		//Normal or Concrete method
		void mul(){
			
		}

}

// -------------------------------------------

class C4 extends C3 {

	@Override
	void m3() {
		// TODO Auto-generated method stub
	}
	
	//Can write constructor and it gets executed once object is created
		C4(){
			System.out.println("Constructor - C4");
		}
		
		//Static Block
			static {
				System.out.println("Static Block - C4");
			}
			
		
		//Can write Instance block and it gets executed once object is created
		{
			System.out.println("Instance Block - C4");
		}

		// Normal or Concrete method with Body
		void dev() {
		}


}

// -------------------

abstract class C5 extends C4 {

	//We can write constructor in Abstract class but it wont run
		//bcz we cant create object of abstract class
		C5(){
			System.out.println("Constructor - C5");
		}
		
		//Static block 
		static {
			System.out.println("Static block - C5");
		}
		
		//We can write Instance Block in Abstract class but it wont execute
			//bcz we cant create object of abstract class
			{
				System.out.println("Instance block - C5");
			}
			
		// abstract method - without body
		abstract void m5();
		
		
		//Normal or Concrete method
		void modulus(){
			
		}

}

//-------------------

public class Demo extends C5 {
	
	@Override
	void m5() {
		// TODO Auto-generated method stub
		
	}
	
//Constructor
	Demo(){
		System.out.println("Constructor - Demo");
	}
	
	//Static block 
	static {
		System.out.println("Static Block - Demo");
	}
	
	//Instance block
	{
		System.out.println("Instance block - Demo");
	}
	
	public static void main(String[] args) {

		System.out.println("Started - main method - Demo");
		//C1 obj1=new C1(); - Gives error because abstract
		System.out.println("***********Creating C2 Object**********************");
		C2 obj2 = new C2(); // Can create bcz concrete class
		System.out.println("***********Creating C4 Object**********************");
		 //C3 obj3=new C3(); - Gives error because abstract
		C4 obj4 = new C4(); // Can create bcz concrete class
		System.out.println("************Creating Demo Object*********************");
        Demo d = new Demo(); // Can create bcz concrete class
        System.out.println("******************************");
        System.out.println("Ended - main method - Demo");

	}

}
