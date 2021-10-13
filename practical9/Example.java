abstract class Shape{
	protected String color="blue";
	protected boolean filled =true;
	
	//constructor
	protected Shape(){}
	
	protected Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	abstract double area();
	public abstract String toString();
}	



	class Circle extends Shape{
		double radius;
		
		public Circle(){}
		
		public Circle(float radius){
			this.radius=radius;
		}
		
		double area(){
			return radius*radius*Math.PI;
		}
		
		public String toString(){
			return "color is: "+super.color+"filled "+ super.filled+"area: "+area();
			
		}
	}
	
	
	class Rectangle extends Shape{
		double length;
		double width;
		
		public Rectangle(){}
		
		public Rectangle(double length, double width){
				this.length=length;
				this.width=width;
		}
		
		double area(){
			return length*width;
		}
		
		public String toString(){
			return "area of the rectangle: "+area();
		}
	}
	
	
	class Triangle extends Shape{
		double base;
		double height;
		
		public Triangle(){}
		
		public Triangle(double base, double height){
				this.base=base;
				this.height=height;
		}
		
		double area(){
			return 0.5*base*height;
		}
		
		public String toString(){
			return "area of the triangle: "+area();
		}
	}



public class Example{
	public static void main(String[] args){
		Shape s1=new Circle(3);
		Shape r1=new Rectangle(5,5);
		Shape t1=new Triangle(7,2);
		
		
		System.out.println(s1.toString());
		System.out.println(r1.toString());
		System.out.println(t1.toString());

	}
	
}
