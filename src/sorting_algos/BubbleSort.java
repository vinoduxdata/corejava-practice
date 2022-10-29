package sorting_algos;

public class BubbleSort {

	
	public static void main(String[] args) {
	int[] arr={4,3,5,1,2};
	int temp = 0;
	int n=arr.length;
	System.out.println("Before sorting");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	System.out.println("--------------");
	for(int i=0;i<n;i++){
		
		for(int j=1;j<n;j++){
			if(arr[j-1]>arr[j]){
			
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
			
		}
		for(int k=0;k<n;k++){
			System.out.print(arr[k]);
		}
	System.out.println("");
		
	}
	System.out.println("After sorting");
for(int i=0;i<n;i++){
	System.out.println(arr[i]);
}

	}

}
