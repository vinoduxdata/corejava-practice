package sorting_algos;

public class Demo {

	public static void main(String[] args) {
		int[] arr={5,4,3,2,1};
		int min=0;
		int temp=0;
		for(int i=0;i<arr.length;i++){
			min=i;
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[j]<arr[min]){
					min=j;
					}
				
			}
			arr[temp]=arr[i];
			arr[i]=arr[min];
			arr[i]=temp;
		}
		
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}
