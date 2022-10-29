package collections;

import java.util.ArrayList;

public class BoxingUnBoxing {

	public static void main(String[] args) {
 
		//See, this is the magic :)
		int i=5;
		char c='V';
		double d=1.11;
		boolean b=false;
		String name="vinod";
		
		
		System.out.println("This is boring - Lets initialize variables in a different way");
		Integer i1=new Integer(10);
		Character c1=new Character('V');
		Double d1=new Double(9.99);
		Boolean b1=new Boolean(false);
		String name1=new String("VINOD");
		
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b);
		System.out.println(name);
		System.out.println("----Class Type----");
		System.out.println(i1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(b1);
		System.out.println(name1);
		
		System.out.println("Got it know? In java even the data types are object");
		
		System.out.println("Lets try type casting here here!!! :)");
		
		int i2=i1;
		char c2=c1;
		boolean b2=b1;
		double d2=d1;
		
		System.out.println(i2);
		System.out.println(c2);
		System.out.println(d2);
		System.out.println(b2);
		
		
		System.out.println("How about converting back by type casting?");
		
		Integer i3=i2;
		Character c3=c2;
		Boolean b3=b2;
		Double d3=d2;
		
		System.out.println(i3);
		System.out.println(c3);
		System.out.println(d3);
		System.out.println(b3);
		
		
		System.out.println("Shall we convert again?? Ufffff no need ");
		
		System.out.println("This concept is very much used with Collections - Which I will explain in tomorrows class");
		
	}

}
