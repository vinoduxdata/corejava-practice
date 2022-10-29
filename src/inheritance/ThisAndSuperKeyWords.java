package inheritance;

//Super keyword is used to refer to members of immediate parent class 
public class ThisAndSuperKeyWords extends ParentClass{
	
	//Declaring this as global so that it can be accessed from any method and 
	// no need to create object multiple time
	ThisAndSuperKeyWords obj;

	public int i = 10;
	
	static void printcolor(){
		//Can write in main method itself, but we cant use super keyword in a static method
	     //obj=new ThisAndSuperKeyWords();
		//System.out.println("Sub class i value is - "+obj.i); //Prints Subclass i value

		//ystem.out.println("Sub class i value is - "+super.i); //Prints Subclass i value
	}
	
	public static void main(String[] args) {
		 //obj=new ThisAndSuperKeyWords();
	}

}


class ParentClass {
	public int i = 5;
}
