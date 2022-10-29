package sorting_algos;

public class Loop {

	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		int sum=0;
		for(int i=0;i<arr.length-1;i++ ){
			
			sum=sum+arr[i]+arr[i+1];
			
			
		}
		System.out.println(sum);
		
	}

}
