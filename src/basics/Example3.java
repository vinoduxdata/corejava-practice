package basics;

public class Example3 extends Ex1{

	int i=11;
	static int j=22;
	public static void main(String[] args) {
		System.out.println("Difference of accessing Static variable using object reference and Class reference");
		Example3 ex1=new Example3();
		System.out.println("using object reference - "+ex1.j);
		System.out.println("using class reference - "+Example2.j);
	}

}


class Ex1{
	int i=1;
	static int j=2;
}