import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		double u = 0.0;
		int [][] arr = new int[4][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[2][0] = 9;
		arr[2][1] = 8;
		arr[2][2] = 1;
		arr[2][3] = 2;
		arr[3][0] = 7;
		arr[3][1] = 4;
		arr[3][2] = 5;
		arr[3][3] = 900;
		for(int x = 0; x <arr.length; x++){
			for(int y=0; y < arr[0].length;y++){
				System.out.print(arr[x][y] + " ");
			}
			System.out.println("");
		}
		for(int r = 0; r <arr.length; r++){
			for(int w=0; w < arr[0].length; w++){
				u=u+arr[r][w];
			}
		}
		System.out.println("The average is "+u/(arr.length*arr[0].length));
		
	}
}
