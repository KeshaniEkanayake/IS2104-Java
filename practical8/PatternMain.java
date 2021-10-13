class PatternGen{

	public void generatePattern(){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	
	public void generatePattern(char a){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	
	
	public void generatePattern(int a){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print('+');
			}
			System.out.println();
		}
	}
	
	public void generatePattern(int a, char b){
		for(int i=0; i<=a; i++){
			for(int j=0; j<i; j++){
				System.out.print(b);
			}
			System.out.println();
		}
	}
}	




class PatternMain{
	public static void main(String[] args){
		PatternGen P1=new PatternGen();
		P1.generatePattern();
		System.out.println();

		
		PatternGen P2=new PatternGen();
		P2.generatePattern('k');
		
		PatternGen P3=new PatternGen();
		P3.generatePattern(4);
		
		PatternGen P4=new PatternGen();
		P4.generatePattern(7,'t');
	}
}