package sorting_algos;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr={8,2,5,3,9,1,7};
		System.out.println("Before sorting");
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
		int min=0;
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
		min=i;
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[j]<arr[min]){
					min=j;
					}
				for(int k=0;k<arr.length;k++){
					System.out.print(arr[k]);
				}
			System.out.println("");
			
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]);
			}
		System.out.println("");
			
			
			
		}
		System.out.println("After sorting");
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}

	}

}}
