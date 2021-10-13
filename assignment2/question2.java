import java.util.*;

class question2{
	public static void main(String[] args){
		Random random=new Random();
		
		for(int i=0; i<10; i++){
			int num=random.nextInt(100);
			if(num%2==0){
				System.out.println(num+"-> Even number");

			}
			else{
				for(int j=3; j<num; j++){
					if(num%j==0){
						System.out.println(num+"-> Odd number, not a prime number");
						break;
					}
					
					else{
						System.out.println(num+"-> Odd number, prime number");
						break;
					}
				}
			}
		}
	}

}