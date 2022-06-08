package pkg;
import java.util.Scanner;
import java.util.Random;

public class birb{
    String name;
    int age;
    Boolean trained = false;
    public birb(){
        name = "Halbert";
        age = 15;
        trained = false;
    }
    public birb(String a){
        this(a, 15, false);
    }
    public birb(int b){
        this("Halbert", b, false);
    }
    public birb(Boolean c){
        this("Halbert", 15, c);
    }
    public birb(String a, Boolean c){
        this(a, 15, c);
    }
    public birb(String a, int b, Boolean c){
        name = a;
        age = b;
        trained = c;
    }
    public void Trick(){
        System.out.println(name+ " is a bird who is " +age+ " years old and is trained.");
        System.out.println(name+" uses Trick! He fucking screams.");
    }
    public void CheapTrick(){
        System.out.println(name+ " is bird who is " +age+ " years old and is not trained.");
        System.out.println(name+" uses Untrained Trick! He shits on the floor.");
    }
}