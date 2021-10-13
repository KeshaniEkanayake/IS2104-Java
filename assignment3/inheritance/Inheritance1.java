//assignment 3-inheritance example 1
//parent class student
class Student{
	private int studentId;
	private String name;
	
	public Student(int studentId, String name){
		this.studentId=studentId;
		this.name=name;
	}
	
	public int getStudentId(){
		return this.studentId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setStudentId(int studentId){
		this.studentId=studentId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String displayDetails(){
		return "Student ID: "+studentId+"	Student name: "+name;
	} 
}


//child class - undergraduate student
class UndergraduateStudent extends Student{
	private String degreeName;
	
	public UndergraduateStudent(int studentId, String name, String degreeName){
	super(studentId,name);
	this.degreeName=degreeName;
	}
	
	public void printDegree(){
		System.out.println(degreeName);
	}
}


//main class
public class Inheritance1{
	public static void main(String[] args){
		UndergraduateStudent ud1=new UndergraduateStudent(20201, "Amal Rathnayake", "Information systems");	
		System.out.println(ud1.displayDetails());
		System.out.print("Degree name: ");
		ud1.printDegree();
	}
}