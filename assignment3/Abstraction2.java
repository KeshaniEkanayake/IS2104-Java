//assignment 3- Abstraction example 2
// find perimeter of a circle and a parallelogram

abstract class Shape{
	abstract double perimeter();
}

//rectangle class
class Parallelogram extends Shape{
	private double side;
	private double base;
	
	
	public Parallelogram(double side, double base){
		this.side=side;
		this.base=base;
	}
	
	//get perimeter
	public double perimeter(){
		return 2*(side+base);
	}
}

//circle 
class Circle extends Shape{

	private double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	//get area
	public double perimeter(){
		return 2*3.14*radius;
	}
}


//main method
class Abstraction2{
	public static void main(String[] args){
		Shape p1=new Parallelogram(20,9);
		System.out.print("Perimeter of the parallelogram= ");
		System.out.println(p1.perimeter());
		
		
		Shape c1= new Circle(3.7);
		System.out.print("Perimeter of the circle= ");
		System.out.println(c1.perimeter());
	}
}