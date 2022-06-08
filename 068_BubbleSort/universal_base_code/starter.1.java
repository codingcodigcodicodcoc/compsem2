import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[]arr = new int[200];
		int u;
		for(u = 0; u<arr.length; u++){
			arr[u]= (int)(Math.random()*999);
			System.out.print(arr[u]+", ");
		}
		System.out.println();
		BubbleSort(arr);
		getSort(arr);
		
		
	}
	public static void BubbleSort(int[] arr){
		for(int x = 0; x<arr.length-1; x++){
			for(int y = 0; y<arr.length-x-1; y++){
				if(arr[y]>arr[y+1]){
					int p = arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=p;
				}
			}
		}
	}
	public static void getSort(int[] arr){
		for(int x = 0; x< arr.length; x++){
			System.out.print(arr[x]);
		}
	}
}
