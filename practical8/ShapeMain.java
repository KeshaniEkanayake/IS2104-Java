class Shape{
	public double getArea(){
		return 0;
	}
}


//rectangle class
class Rectangle extends Shape{
	private double length;
	private double width;
	
	
	public Rectangle(double width, double length){
		this.length=length;
		this.width=width;
	}
	
	//get area
	public double getArea(){
		return width*length;
	}
}

//triangle class
class Triangle extends Shape{
	private double base;
	private double height;
	
	
	public Triangle(double base, double height){
		this.base=base;
		this.height=height;

	}
	
	//get area
	public double getArea(){
		return 0.5*base*height;
	}
}

//circle 
class Circle extends Shape{

	private double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	//get area
	public double getArea(){
		return 3.14*radius*radius;
	}
}

class ShapeMain{
	public static void main(String[] args){
		Rectangle R1=new Rectangle(15.5, 10.1);
		System.out.println(R1.getArea());
		
		Triangle T1= new Triangle(10.5, 5.5);
		System.out.println(T1.getArea());
		
		Circle C1= new Circle(7.7);
		System.out.println(C1.getArea());
	}
}