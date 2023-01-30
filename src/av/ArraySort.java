package av;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		 
		int arr[]= {90,23,5,109,12,22,67,34};
		
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++) {
			
		for(int j=0; j<arr.length-1;j++) {
			
			int temp=0;
			
			if(arr[j] < arr[j+1]) {
				
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;	
			}
		}
		}
		System.out.println(Arrays.toString(arr));
	}
}
