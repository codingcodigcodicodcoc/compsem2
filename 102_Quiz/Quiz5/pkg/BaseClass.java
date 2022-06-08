package pkg;
import java.util.Scanner;
import java.util.Random;


private int getchargingCost(int starthour, int chargetime){
	int c = starthour;
	int x;
	if(c+chargetime<24){
	for(c=starthour; c < chargetime; c++){
		x = rateTable[0];
		x=x+rateTable[c+1];
		}
		return x;
	}
	else if(c+chargetime>=24){
		int y;
		int j =1;
		while(j<24){
			y = rateTable[0];
			y = y+rateTable[j];
			j++;
		}
		int f;
		int a;
		int v = c+chargetime - 24;
			for(a=c; a < v; a++){
			f = rateTable[0];
			f=f+rateTable[a];
			}
		y=y+f;	
		return y;
	}

}
private int getChargingTime(int chargetime){
	for(int o = 0; o<chargetime; o++){
	int g = rateTable[0];	
	g=g+rateTable[chargetime-chargetime+o];
	}
	return g;
}