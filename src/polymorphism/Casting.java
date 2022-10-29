package polymorphism;

public class Casting extends C5{
	int i=6;
    static double j=6.6;

	public static void main(String[] args) {
		//Trying to downcast without Upcasting - gives error
		/*
		C5 c=new C5();
		casting cast=c;
		*/
		System.out.println("Object creation for - Class 6");
		Casting cas=new Casting();
		System.out.println("Printing the value of i - "+cas.i);
		System.out.println("Printing the value of j - "+cas.j);
		System.out.println("---------------------------");
		
		System.out.println("Casting to Class 5");
		C5 c5=cas;
		System.out.println("Printing the value of i - "+c5.i);
		System.out.println("Printing the value of j -"+c5.j);
		System.out.println("---------------------------");
		
		System.out.println("Casting to Class 4");
		C4 c4=cas;
		System.out.println("Printing the value of i - "+c4.i);
		System.out.println("Printing the value of j - "+c4.j);
		System.out.println("---------------------------");
		
		System.out.println("Casting to Class 3");
		C3 c3= cas;
		System.out.println("Printing the value of i - "+c3.i);
		System.out.println("Printing the value of j - "+c3.j);
		System.out.println("---------------------------");
		
		System.out.println("Casting to Class 2");
		C2 c2=cas;
		System.out.println("Printing the value of i - "+c2.i);
		System.out.println("Printing the value of j - "+c2.j);
		System.out.println("---------------------------");
		
		System.out.println("Casting to Class 1");
		C1 c1=cas; 
		System.out.println("Printing the value of i - "+c1.i);
		System.out.println("Printing the value of j - "+c1.j);
		System.out.println("---------------------------");
		
		System.out.println("******Downcasting**********");
		
		System.out.println("Casting to Class 2");
		C2 c22=cas;
		System.out.println("Printing the value of i - "+c22.i);
		System.out.println("Printing the value of j - "+c22.j);
		System.out.println("---------------------------");
		
		
		System.out.println("Casting to Class 3");
		C3 c33= cas;
		System.out.println("Printing the value of i - "+c33.i);
		System.out.println("Printing the value of j - "+c33.j);
		System.out.println("---------------------------");
		
		System.out.println("Casting to Class 4");
		C4 c44=cas;
		System.out.println("Printing the value of i - "+c44.i);
		System.out.println("Printing the value of j - "+c44.j);
		System.out.println("---------------------------");
		
		System.out.println("Casting to Class 5");
		C5 c55=cas;
		System.out.println("Printing the value of i - "+c55.i);
		System.out.println("Printing the value of j -"+c55.j);
		System.out.println("---------------------------");
		
		System.out.println("******Change in the order of Up casting**********");
		
		System.out.println("Casting to Class 5 to Class 2");
		C2 c222=cas;
		System.out.println("Printing the value of i - "+c222.i);
		System.out.println("Printing the value of j -"+c222.j);
		System.out.println("---------------------------");
		
		
		
	}

}
	
	class C1{
		int i=1;
	    static double j=1.1;
	}

	class C2 extends C1{
		
		int i=2;
	    static double j=2.2;
	}

	class C3 extends C2{
		
		int i=3;
	    static double j=3.3;
	    
	}

	class C4 extends C3{
		
		int i=4;
	    static double j=4.4;
	    
	}

	class C5 extends C4{
		
		int i=5;
	    static double j=5.5;
	    
	}

