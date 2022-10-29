package encapsulation;

public class TestAccessSpecifiers {
	/* Inheritance 
	 * import
	 * Nested class - are the ways to access members of the one class from another
	 * 
	 * Access specifiers are the means to have control over access
	 * 
	 * Making a member Static means - Can access only using Class reference
	 * While inheriting static members are not inherited
	 * private Static - Can't access even using class reference
	 * 
	 * Class can only be public or default 
	 * 
	 * In order to enforce security mark field as private &
	 * Create getters and Setters
	 */
	
	

	public static void main(String[] args) {
		//AccessSpecifiers.i; - Cant access
		System.out.println("Static j - "+AccessSpecifiers.j);
		AccessSpecifiers as=new AccessSpecifiers();
		//as.a; - Cant access - Instance private
		System.out.println("Instance b - "+as.b);
		
	}

}



class AccessSpecifiers{
	static private  int i=2;
	static int j=3;
	private int a=4;
	int b=5;
}



