//practical 3
import java.util.Scanner;
import java.util.Random;


public class question4{
	public static void main (String[] args){
		Random random=new Random();
		//int upperbound=100;
		
		for(int i=0; i<5; i++){
			
			int num=random.nextInt(100);
			if(num<50)
				System.out.println(num+" : Low");
			else
				System.out.println(num+" : "+"High");
		}
		
		
	}
}