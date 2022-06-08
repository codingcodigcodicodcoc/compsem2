import java.util.*;
import java.util.Scanner;

class starter {
	public static void printArray(ArrayList<Integer> arr){
		for(int x=0; x < arr.size();x++){
			System.out.println(arr.get(x));
		}
	}
	public static void addValuesArrayList(int n,ArrayList<Integer> arr){
		int y = 0;
		while(y<n){
			int h = (int)(Math.random()*9);
			arr.add(h);
			y++;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList<Integer>(0);
		System.out.println("How value");
		int g = sc.nextInt();
		addValuesArrayList(g,arr);
		printArray(arr);
		



	}
}
