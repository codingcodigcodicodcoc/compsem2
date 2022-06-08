package pkg;
import java.util.Scanner;
import java.util.Random;

public class Tortoise{
    String name;
    int age;
    Boolean trained = false;
    public Tortoise(){
        name = "Halbert";
        age = 100;
        trained = false;
    }
    public Tortoise(String a){
        this(a, 15, false);
    }
    public Tortoise(int b){
        this("Halbert", b, false);
    }
    public Tortoise(Boolean c){
        this("Halbert", 15, c);
    }
    public Tortoise(String a, Boolean c){
        this(a, 15, c);
    }
    public Tortoise(String a, int b, Boolean c){
        name = a;
        age = b;
        trained = c;
    }
    public void Trick(){
        System.out.println(name+ " is a tortoise who is " +age+ " years old and is trained.");
        System.out.println(name+" uses Trick! He does nothing.");
    }
    public void CheapTrick(){
        System.out.println(name+ " is tortoise who is " +age+ " years old and is not trained.");
        System.out.println(name+" uses Untrained Trick! He does nothing.");
    }
}