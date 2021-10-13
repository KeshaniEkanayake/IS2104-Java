//assignment 3 - abstraction  example 1
//speed limits for motor bicycles  = 40Km/h, speed limits for cars = 60Km/h
abstract class Vehicle{
	protected String color;
	
	protected Vehicle(String color){
		this.color=color;
	}
	abstract void displayMaxSpeed();
}

class Bicyle extends Vehicle{
	public Bicyle(String color){
		super(color);
	}
	void displayMaxSpeed(){
		System.out.println("Speed limit for a motor bicycle= 40Km/h");
	}
}

class Car extends Vehicle{
	public Car(String color){
		super(color);
	}
	void displayMaxSpeed(){
		System.out.println("Speed limit for a car= 60Km/h");
	}
}

class Abstraction{
		public static void main(String[] args){
			Vehicle b1=new Bicyle("blue");
			b1.displayMaxSpeed();
		
			Vehicle c1=new Car("black");
			c1.displayMaxSpeed();
	}
}