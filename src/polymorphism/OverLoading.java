package polymorphism;

public class OverLoading extends Ex {

	public OverLoading() {
		System.out.println("Constructor 1 - Sub Class");
	}
	
	public OverLoading(int i  ) {
		System.out.println("Constructor 2 - Sub Class");
	}
	
	public OverLoading(double i) {
		System.out.println("Constructor 3 - Sub Class");
	}

	public static void main(String[] args) {
	OverLoading ol=new  OverLoading();
	OverLoading ol2=new  OverLoading(1);
	OverLoading ol3=new  OverLoading(2.2);
	
	}

}

class Ex {
	
	//Constructor overloading 
	Ex(){
		System.out.println("Constructor 1 - Super Class");
	}
	
	Ex(int i){
		System.out.println("Constructor 2 - Super Class");
	}
	
	Ex(double i){
		System.out.println("Constructor 3 - Super Class");
	}
	
	{
		System.out.println("Instance block  - Super Class");	
	}
	static{
		System.out.println("Static block  - Super Class");
	}
}
