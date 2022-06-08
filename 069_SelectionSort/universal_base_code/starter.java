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
		SelectionSort(arr);
		getSort(arr);
		
		
	}
	public static void SelectionSort(int[] arr){
		int x;
		int y;
		int p;
		for(x = 0; x<arr.length; x++){
			p = x;
			for(y = x+1; y<arr.length; y++){
				if(arr[y]<arr[p]){
					p = y;
				}
			}
			int r = arr[x];
			arr[x] =arr[p];
			arr[p] = r;
		}
	}
	public static void getSort(int[] arr){
		for(int x = 0; x< arr.length; x++){
			System.out.print(arr[x]+", ");
		}
	}
}
