class Person{
	private double weight;
	private double height;
	
	public double getWeight(){
		return weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setWeight(double weight){
		
		this.weight=weight;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	public double result(){
		double BMI=weight/(height*height);
		return BMI;
	}	
}

public class BMI{
	public static void main(String[] args){
		Person p1=new Person();
		
		p1.setWeight(60);
		p1.setHeight(1.5);
		
		System.out.println("The BMI value is= "+p1.result());	
	} 
	
}