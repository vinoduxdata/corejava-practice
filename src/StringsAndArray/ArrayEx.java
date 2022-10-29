package StringsAndArray;

public class ArrayEx {
	/* Array is most important concept in CS
	 * Its a linear data structure
	 * In array elements are store one next to other so Accessing is faster
	 * Ex arr[4] - |0|1|2|3|
	 * In other data structures like List and all elements are not stored one next to other
	 * They are stored in random memory location
	 * bcz array elements are stored one next to other and Computer knows -
	 * the starting memory address of array - accessing any element is array is just 
	 * base address + position of the element you want to access
	 * 
	 * In array accessing any element takes just 1 unit of time
	 * and Its the fastest way of accessing
	 * So wherever fast access is required we should go for arrays
	 * 
	 * Arrays are very simple to implement and use
	 * 
	 * Main problems are fixed size, size should be known before, and if size of array grows 
	 * cant increase the size
	 */

	public static void main(String[] args) {
		//Ways of creating array
		int[] arr1={0,1,2,3,4};
		int[] arr2=new int[5];
		arr2[0]=10;
		arr2[1]=11;
		arr2[2]=12;
		arr2[3]=13;
		arr2[4]=14;	
		//arr2[5]=15;// It wont give error here, but it gives exception while running
		//This is the most common exception you guyz get
		//Come on - uncomment - Run and have some fun :)
		
		System.out.println(arr1.length);
		
	
		int[] arr3=new int[10];
		for(int i=0;i<arr3.length;i++){
		//Adding elements using loop
			
			arr3[i]=i;
		}
		
		//print elements
			System.out.println("print elements");
			for(int i=0;i<arr3.length;i++){
				//Adding elements using loop
					System.out.println(arr3[i]);
				}
			
		//We can search for an element in the array
		// What else we can do? Thats all right?
		//Creating an array, adding into that, taking from it? :)
			
		// And we can print the index of the particular element
			char[] arr4={'v','I','N','O','D',};
			char c='O';
		//Print at what position character O is present
			System.out.println("Print at what position character O is present");
			for(int i=0;i<arr4.length;i++){
				if(c==arr4[i]){
					System.out.println("This array contains the character "+c+" and the index is "+i+" means you got na? its "+(i+1)+"th location");
					break;
				}
			}
		System.out.println("And FYI Searching for an element in the array is called traversing the arrray");	

	}
}
