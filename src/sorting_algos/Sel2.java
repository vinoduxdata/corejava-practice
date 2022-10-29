package sorting_algos;

public class Sel2 {

	public static void main(String[] args) {
		int arr[]={5,4,3,2,1};
		int min,temp=0;
		for(int i=0;i<arr.length;i++){
		min=i;
		
		for(int j= i+1;j<arr.length;j++){
			if(arr[min]>arr[j]){
				temp=min;
			}
		}
		
		arr[min]=arr[i];
		arr[i]=arr[temp];

		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
