import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		ArrayList <Integer> arr = new ArrayList <Integer> ();
		int u;
		for(u = 0; u<100; u++){
			arr.add((int)(Math.random()*999));
			System.out.print(arr.get(u)+", ");
		}
		System.out.println();
		BubbleSort(arr);
		SelectionSort(arr);
		INSort(arr);
		getSort(arr);
		System.out.println();
		getMedian(arr);
		
	}
	public static void BubbleSort(ArrayList <Integer> arr){
		for(int x = 0; x<arr.size()-1; x++){
			for(int y = 0; y<arr.size()-x-1; y++){
				if(arr.get(y)>arr.get(y+1)){
					int p = arr.get(y);
					arr.set(y, arr.get(y+1));
					arr.set(y+1, p);
				}
			}
		}
	}
	public static void SelectionSort(ArrayList <Integer> arr){
		int x;
		int y;
		int p;
		for(x = 0; x<arr.size(); x++){
			p = x;
			for(y = x+1; y<arr.size(); y++){
				if(arr.get(y)<arr.get(p)){
					p = y;
				}
			}
			int r = arr.get(x);
			arr.set(x, arr.get(p));
			arr.set(p,r);
		}
	}
	public static void INSort(ArrayList <Integer> arr){
		int x;
		int y;
		int p;
		for(x = 0; x<arr.size(); x++){
			p = arr.get(x);
			y=x-1;
			while(y >= 0 && arr.get(y) > p){
				arr.set(y+1, arr.get(y));
					y=y-1;
				}
				arr.set(y+1,p);
			}
		}
	public static void getSort(ArrayList <Integer> arr){
		for(int x = 0; x< arr.size(); x++){
			System.out.print(arr.get(x)+", ");
		}
	}
	public static void getMedian(ArrayList <Integer> arr){
		int x;
		x=arr.size()/2;
		if((arr.size()%2)==0){ 
			System.out.println("Median is "+arr.get(x));
		}
	}
}