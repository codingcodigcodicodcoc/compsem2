import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr5 = {1, 2, 3, 4, 5, 6};
		int median1 = getMedian(arr4);  	//The value of median1 is 4.
		int median2 = getMedian(arr5);	//The value of median2 is 3.
		System.out.println(getMedian(arr4));
		System.out.println(getMedian(arr5));
	}
		public static int getMedian(int[] array){
			int x = array.length;
			int y;
			int z;
			if(x%2 == 0){
				x/2 = y;
				array[y] = z;
				return z;
			}
			else{
				x/2 + 1 = y;
				array[y] = z;
				return z;
			}
		}
}