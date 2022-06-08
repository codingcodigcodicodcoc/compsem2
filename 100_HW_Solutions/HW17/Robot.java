import pkg.*;

class Robot {
	public static void main(String args[]) {
		private boolean forwardMOvedBlock(){
			int x = 0;
			if(array[x] == null){
				return true;
			}
			else{
				facingright = true;
				return false;
			}
		}
		private void move(){
			int x = 0;
				if(x<= array.length()){
					if(array[x] == null){
							x++;
						}
					else if (array[x] != 0){
						for(int c = 0; c != array[x]; c++){
							array[x] = array[x] - 1;	
						}
					}
				}
				else if(x == array.length()){
					for(x=0;x != array.length()-1; x++){
						array[x] = array[x-1];
					}
				}
		}
		public int clearHall(){
			int v = 0;
			for(x=0; v == array[x]; x++){
				facingright = true;
				if(x == array.length()){
					facingright = false;
					for(x=0;x != array.length()-1; x++){
						array[x] = array[x-1];
				}
			}
		}
	}
}
