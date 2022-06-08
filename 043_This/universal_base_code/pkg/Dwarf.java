package pkg;
import java.util.Scanner;
import java.util.Random;


	public class Dwarf {
		String name;
		int age;
		public Dwarf(){
			name = "";
			age = 0;
		}
		public Dwarf(String name, int age){
			this.name = name;
			this.age = age;
		}
		public void setStuffiename(String a){
			name = a;
		}
		public void setStuffieage(int b){
			age = b;
		}
		public boolean isSameName(String name){
			if(this.name.equals(name)){
				return true;
			}
			else {
				return false;
			}
		}
		public String getStuffie(){
			return name;
		}
		public int getStuffied(){
			return age;
		}
	}