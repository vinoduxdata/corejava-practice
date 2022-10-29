package inheritance;

public class OverRideWithAccessSpecifiers {

}

class SubClass{
	
	private int d=10;
	static private int j=5; //We can write but it does not make any sense
	final static int f=50; //We can write but it does not make any sense
	
	
	public static void main(String[] args) {
		
		//public int a=2; - Invalid modifier
		//private int c=4; - Invalid modifier
		
		SubClass sc=new SubClass();
		//You can make local variable a private - but still you can acess within 
		sc.d=10;
	}
	
	
}
