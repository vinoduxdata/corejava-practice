package problems;

public class AddNumberUsingCharAndInt {

	public static void main(String[] args) {
		
		//We can only do Increment on Integer using Char
		// Cant add
		int i=1;
		char c='1';
		System.out.println("Increment using int "+(++i));
		System.out.println("Increment using Char "+(++c));
		System.out.println("------------");
		System.out.println("Addition using int "+(i+10));
		System.out.println("Addition using Char "+(c+10));

	}

}
