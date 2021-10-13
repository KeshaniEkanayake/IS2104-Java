import java.util.*;

class question5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		char[] strArray= new char[s.length()];
		
		System.out.println("Length of the string: "+ s.length());
		
		//put values of the string to an array
		for(int i=0; i<s.length();i++){
			strArray[i]=s.charAt(i);
		}	

		//print the elements in the strArray
		System.out.println(Arrays.toString(strArray));
		
		int maxCount=0;
		int minCount=1;
		
		char maxChar=strArray[0];
		char minChar=strArray[0];
		
		for(int i=0; i<strArray.length;i++){
			int max=1;
			int min=1;
			for(int j=i+1; j<strArray.length;j++){
				if(strArray[i]==strArray[j] && strArray[i]!=' '){
					max=max+1;
					min=min+1;
				}
			}
			
			if(i==0)
				minCount=min;
			
			else{
				if(max>maxCount){
					maxCount=max;
					maxChar=strArray[i];
				}
				if(min<minCount){
					minChar=strArray[i];
					
				}
			}
		}
		System.out.println("Maximum occuring character: "+ maxChar);
		System.out.println("Maximum count: "+maxCount);
		
		System.out.println("Minimum occuring character: "+ minChar);
		System.out.println("Maximum count: "+minCount);
		
	}
}