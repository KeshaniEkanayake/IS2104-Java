public class Animal{
	private String eat;
	private int noOfLegs;
	
	public Animal(){
		
	}
	
	public Animal(String food, int legs){
		this.eat=food;
		this.noOfLegs=legs;
	}
	
	public String getEat(){
		return this.eat;
	}
	
	/*variables are private, so we need accessor methods 
	1)getter 2) setter 
	to set and retrieve values of private 
	variables. */
	public void setEat(String eat){
		this.eat=eat;
	}
	
	public int getNoOfLegs(){
		return this.noOfLegs;
	}
		
	

	public void setNoOfLegs(int noOfLegs){
		this.noOfLegs=noOfLegs;
	}	
	
	
}