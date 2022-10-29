package StringsAndArray;

public class StringsEx {
	
	/*String is not a very basic data type as 
	 * String is treated as Array of Characters
	 * 
	 */
	
	//Program to list the operations avaialble with Strings
	public static void main(String[] args) {
	String name="VINOD";
	String nameSmall="vinod";
	System.out.println("vinod==VINOD? "+nameSmall.equals(name));
	System.out.println("vinod==VINOD? ignoring case - "+nameSmall.equalsIgnoreCase(name));
	System.out.println("vinod starts with vin? "+nameSmall.startsWith("vin"));
	System.out.println("vinod starts with VIN? "+nameSmall.startsWith("VIN"));
	System.out.println("vinod ends with od? "+nameSmall.endsWith("od"));
	System.out.println("vinod ends with OD? "+nameSmall.endsWith("OD"));
	
	System.out.println("String.tocharArry is useful for programs like identify repeating char");
	char[] n=name.toCharArray();
	char[] nSmall=nameSmall.toCharArray();
	for(int i=0;i<n.length;i++){
		System.out.println(n[i]);
	}
	
	System.out.println("-------");
	
	for(int i=0;i<nSmall.length;i++){
		System.out.println(nSmall[i]);
	}
	
	System.out.println("-----");
	System.out.println("Starting index - "+name.charAt(0));
	System.out.println("End index - "+name.charAt(4));
	
	System.out.println("-------");
	System.out.println("---Append----");
	System.out.println(name.concat(" KUMAR K V "));
	
	System.out.println("-------");
	System.out.println("----Verify a String contains some Character---");
	System.out.println(name.contains("I"));
	System.out.println(name.contains("A"));

	}

}
