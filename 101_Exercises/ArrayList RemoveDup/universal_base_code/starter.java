import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*5));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void removeDup(ArrayList<Integer> arr){
		int p;
		for(int i = 0; i < arr.size(); i++){
			p = arr.get(i);
			for(int c = i+1; c<arr.size(); c++){
			if(p == arr.get(c) && p != arr.get(c)){
				arr.remove(c);
				c--;
			}
			}
		}
	}
}
