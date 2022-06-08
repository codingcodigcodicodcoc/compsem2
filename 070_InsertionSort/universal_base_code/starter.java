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
		INSort(arr);
		getSort(arr);
		
		
	}
	public static void INSort(int[] arr){
		int x;
		int y;
		int p;
		for(x = 0; x<arr.length; x++){
			p = arr[x];
			y=x-1;
			while(y >= 0 && arr[y] > p){
				arr[y+1]=arr[y];
					y=y-1;
				}
				arr[y+1]=p;
			}
		}
	public static void getSort(int[] arr){
		for(int x = 0; x< arr.length; x++){
			System.out.print(arr[x]+", ");
		}
	}
}