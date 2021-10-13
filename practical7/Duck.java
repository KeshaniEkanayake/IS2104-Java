public class Duck extends Animal{
	private int noOfWings;
	
	
	public Duck(String food, int legs, int noOfWings){
		super(food, legs);
		this.noOfWings=noOfWings;
	}
	
	
	
	public int getNoOfWings(){
		return this.noOfWings;
	}
	
	public void setNoOfWings(int noOfWings){
		this.noOfWings=noOfWings;
		
	}
	
	public void quack(){
		System.out.println("Duck can quack");
	}
}