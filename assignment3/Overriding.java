//assignment 3 polymorphism example 1 -overriding 
//speed limits for motor bicycles in srilanka = 40Km/h
//speed limits for cars in srilanka = 60Km/h
class Vehicle{
	public Vehicle(){}
	void displayMaxSpeed(){
		System.out.println("Displays the maximum speed of a vehicle");
	}
}

class Bicyle extends Vehicle{
	public Bicyle(){}
	void displayMaxSpeed(){
		System.out.println("Speed limit for motor cycles in Sri Lanka= 40Km/h");
	}
}

class Car extends Vehicle{
	public Car(){}
	void displayMaxSpeed(){
		System.out.println("Speed limit for cars in Sri Lanka= 60Km/h");
	}
}

class Overriding{
		public static void main(String[] args){
			Bicyle b1=new Bicyle();
			b1.displayMaxSpeed();
		
			Car c1=new Car();
			c1.displayMaxSpeed();
	}
}