public class Cat extends Animal{
	private String color;
	private String name;
	
	public Cat(){
		
	}
	
	public Cat(String food, int legs){
		super(food, legs);
		
	}
	
	public Cat(String food, int legs, String color, String name){
		super(food, legs); /*get the corresponding values from the super
							class*/
		this.name=name;
		this.color=color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	
	
	public void setColor(String color){
		this.color=color; 
	}
	
	public void printName(){
		System.out.println("Name of cat is "+this.name);
	}
}