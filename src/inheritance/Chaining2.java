package inheritance;

public class Chaining2 extends C5{

	public Chaining2() {
		System.out.println("Default Constructor - Class Chaining2");
	}
	
	
	{
		System.out.println("Instance Block - Class ");
	}
	
	{
		System.out.println("Static  Block - Class ");
	}
	public static void main(String[] args) {
		
	}

}

class C1{
	public C1() {
		System.out.println("Constructo - Class C1");
	}

	public C1(int i) {
		System.out.println("Constructo - Class C1");
	}
	
	{
		System.out.println("Instance Block - Class C1 ");
	}
	
	{
		System.out.println("Static  Block - Class C1");
	}
}

class C2{
	public C2() {
		System.out.println("Constructo - Class C2");
	}

	public C2(int i) {
		System.out.println("Constructo - Class C2");
	}
	
	{
		System.out.println("Instance Block - Class C2 ");
	}
	
	{
		System.out.println("Static  Block - Class C2");
	}
}

class C3{
	public C3() {
		System.out.println("Constructo - Class C3");
	}
	
	public C3(int i) {
		System.out.println("Constructo - Class C3");
	}

	
	{
		System.out.println("Instance Block - Class C3");
	}
	
	{
		System.out.println("Static  Block - Class C3");
	}
}

class C4{
	public C4() {
		System.out.println("Constructo - Class C4");
	}
	
	public C4(int i) {
		System.out.println("Constructo - Class C4");
	}

	
	{
		System.out.println("Instance Block - Class C4");
	}
	
	{
		System.out.println("Static  Block - Class C4");
	}
}

class C5{
	public C5() {
		System.out.println("Constructo - Class C5");
	}
	
	public C5(int i) {
		System.out.println("Constructo - Class C5");
	}

	
	{
		System.out.println("Instance Block - Class C5");
	}
	
	{
		System.out.println("Static  Block - Class C5");
	}
}
