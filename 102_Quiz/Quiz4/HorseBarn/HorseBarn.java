import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn extends Horse{
	public int findHorseSpace(String name){
		for(int f = 0; f<N; f++){
		int horsey = spaces[f].getName();
		if(horsey.equals(name)){
			return space(f);
		}
		}
	}
	public void consolidate(){
		for(int f = 0; f<N; f++){
			if(space[f] = null){
				String g = this.space(f-1);
				for(int c = 0; c<N; c++){
					if(space[c] != null){
						space[f]= space[f-c];
					}
				}
			}
		}
	}
}
