package abstraction;

public abstract class AbstractClassWithoutAbstractMethod {
	/*
	 * Abstract class can have 
	 * Only abstract methods  
	 * Abstract methods and Concrete methods Even if one method is abstract, class will become
	 * abstract class
	 */
	
	/*What happens when not even single abstract method but still we
	 * make the class abstract
	 */


	//A Normal method
	 void add()
	 {
		
	 }
	 

	public static void main(String[] args) {
     //AbstractClass c1=new AbstractClass();
	/*Uncomment this - This gives error "Cannot instantiate abstract type "
    Whats is the use having abstract class with only the normal mehod and 
    Not able to create object?
    */

	}

}
