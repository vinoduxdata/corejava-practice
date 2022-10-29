package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		//While is just a plain loop, We have to provide
		//Intialization, Counter / Operation and Exit condition
		//Declare intialization outside of the loop
		//condition in condition block and exit at the end of the loop
		
		int i=1;
		while(i<5){
			System.out.println("iteration "+i);
			//++i; PreInrement
			//Post Increment
			++i;
		}
	}

}
