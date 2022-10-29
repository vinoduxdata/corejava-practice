package problems;

public class StringToCharArray {

	public static void main(String[] args) {
		String name="CHANDRU";
		char[] n=name.toCharArray();
		System.out.println("Difference between String.length() and arr.length");
		System.out.println("String.length() "+name.length());
		System.out.println("Array.length "+n.length);
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
	}

}
