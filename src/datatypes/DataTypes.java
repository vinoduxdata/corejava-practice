package datatypes;



public class DataTypes {
	//We cant print default value of local variables
	//Can print default variable for Static n Instance variables
	
	
	// Instance data members can be accessed using Object reference 
	// Static data members can be accessed using class reference
	
	
	//Declaration
	//Just declaring and then assigning value works only for Class variables 
	// Not local variables
	
	//Instance variables
	short s;
	char c;
	boolean b;
	double f;
	
	//static variables
	static short s1;
	static char c1;
	static boolean b1;
	static double f1;
	
	public static void main(String[] args) {
	DataTypes dt=new DataTypes();
	
	
		System.out.println("****default value - Instance variables");
	
		System.out.println(dt.s);
		System.out.println(dt.c);
		System.out.println(dt.b);
		System.out.println(dt.f);
		
		// dt.s1=2; - can access static using object reference but not recommended
		//dt.c1='Z';
		//dt.b1=true;
		
		
		System.out.println("****default value - Static variables");
		
		System.out.println(DataTypes.s1);
		System.out.println(DataTypes.c1);
		System.out.println(DataTypes.b1);
		System.out.println(DataTypes.f1);
		
		
		//Local variables - Un-comment to see Errors
//		short s;
//		char c;
//		boolean b;
//		float f;
		
		
		//Intialization - Instance variables
		
		dt.s=1;
		dt.c='K';
		dt.b=true;
		dt.f=1.1;
		
		
		//Intialization - Static variables
		DataTypes.s1=1;
		DataTypes.c1='K';
		DataTypes.b1=true;
		DataTypes.f1=1.1;
		
		System.out.println("********After initilization - Instance***********");
		
		
		System.out.println(dt.s);
		System.out.println(dt.c);
		System.out.println(dt.b);
		System.out.println(dt.f);
		
		System.out.println("********After initilization - Static***********");
		
		
		System.out.println(DataTypes.s1);
		System.out.println(DataTypes.c1);
		System.out.println(DataTypes.b1);
		System.out.println(DataTypes.f1);
		
		
		dt.s=2;
		dt.c='V';
		dt.b=false;
		dt.f=2.2;
		
		dt.s1=2;
		dt.c1='V';
		dt.b1=false;
		dt.f1=2.2;
		

		System.out.println("********After Re - initilization - Instance***********");
		
		System.out.println(dt.s);
		System.out.println(dt.c);
		System.out.println(dt.b);
		System.out.println(dt.f);
		
		System.out.println("********After Re - initilization - Static ***********");
		
		System.out.println(DataTypes.s1);
		System.out.println(DataTypes.c1);
		System.out.println(DataTypes.b1);
		System.out.println(DataTypes.f1);
	
		
	}

}
