import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What character?");
		String p = sc.nextLine();
		System.out.println("How width?");
		int i = sc.nextInt();
		System.out.println("How height?");
		int s = sc.nextInt();
		for(int y = 0; y < s; y++){
		System.out.println(" ");
		for(int j=0; j < i;j++){
			System.out.print(p+" ");
		}
		}

		
	}
}
