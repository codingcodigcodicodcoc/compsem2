package pkg;

public class CVMath {
	public static void specialSquare(int n)
	{	
		int[]array = new int[n];
		int[]numbers = new int[n];
		for(int i = 1; 1<n; i++){
			array[i-1] = i*i;
			for(int c = 1; c<array[i-1];c++){
				numbers[i-1] = numbers[i-1]+c;
				if(array[i-1] == numbers[i-1]){
					System.out.println(i+" is a special square");
				}
			}
		}
	}
}
