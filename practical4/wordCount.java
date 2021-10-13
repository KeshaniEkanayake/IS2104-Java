//practical 4
import java.util.*;

public class wordCount{
	public static void main (String[] args){
	Scanner sc= new Scanner(System.in); 
	
	//get the user input
	System.out.print("Enter a sentence or a paragraph: ");  
	String s= sc.nextLine();              
	System.out.println(s);  
	
	
	String[] strArray=s.split(" ");
	
	
	//another arrray to store counted words
	ArrayList<Integer> countedWords= new ArrayList<>();
	
	//get frequency of words
	for(int i=0; i<strArray.length; i++){
		if(countedWords.contains(i)){
			continue;
		}
		
		int count=1;
		for(int j=i+1; j<strArray.length; j++){
			if(strArray[i].equals(strArray[j])){
				count=count+1;
				countedWords.add(j);
			}
			
		}
		
		System.out.println(strArray[i]+" - "+count);
	}
	
	
	
	}
}

