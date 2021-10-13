import java.util.Scanner;

public class SumOfMatrices{
	public static void main(String []args){
		int first[][]={{ 1 , 2 , 3 },{ 4 , 5 , 6 },{ 7 , 8 , 9 }};
		int second[][]={{ 2 , 3 , 4 },{ 5 , 6 , 7 },{ 8 , 9 , 1 }};
		
		int answer[][]=new int[3][3];
		
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				answer[i][j]=first[i][j]+second[i][j];
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}