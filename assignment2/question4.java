import java.util.*;

class question4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in the integer array: ");
		int n=sc.nextInt();
		
		int numArray[]=new int[n];
		
		//get elements from the user and store them in 'numArray' array
		for(int i=0; i<numArray.length; i++){
			System.out.println("Enter element: ");
			numArray[i]=sc.nextInt();
		}
		
		//get an arraylist to unique values
		ArrayList<Integer> nonDuplicate=new ArrayList<>();
		
		for(int i=0; i<numArray.length; i++){
			if(nonDuplicate.contains(numArray[i])){
				continue;
			}
			
			else{
				nonDuplicate.add(numArray[i]);
			}
			
			for(int j=i+1; j<numArray.length; j++){
				if(numArray[i]==numArray[j]){
					continue;
				}
				
				else{
					if(nonDuplicate.contains(numArray[j])){
						continue;
					}
					else{
						nonDuplicate.add(numArray[j]);
					}
				}
			}
			
		}
		
		System.out.println("Number of values in the arrayList after removing duplicate elements: "+ nonDuplicate.size());
		System.out.println("New array after removing duplicate values: "+ nonDuplicate);
	}
}