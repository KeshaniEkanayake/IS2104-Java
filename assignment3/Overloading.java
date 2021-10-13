//polymorphism example 2- mehtod overloading
// find perimeter of a circle and a parallelogram

class Shape{
	//perimeter of a parallelogram
	static double perimeter(double side, double base){
		return 2*(side+base);
	}
	
	//perimetr of a circle
	static double perimeter(double radius){
		return 2*3.14*radius;
	}
}

//main method
class Overloading{
	public static void main(String[] args){
		
		System.out.print("Perimeter of the given parallelogram= ");
		System.out.println(Shape.perimeter(20, 9));
				
		System.out.print("Perimeter of the given circle= ");
		System.out.println(Shape.perimeter(3.5));
	}
}