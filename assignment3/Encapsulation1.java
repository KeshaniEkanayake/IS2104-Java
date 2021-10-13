//assignment 3 - encapsulation

class Student{
	private int studentId;
	private String name;
	
	
	public int getStudentId(){
		return studentId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setStudentId(int studentId){
		this.studentId=studentId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	
}

public class Encapsulation1{
	public static void main(String[] args){
		Student s1=new Student();
		
		s1.setStudentId(20201);
		s1.setName("John Allan");
		
		System.out.println("Student ID: "+s1.getStudentId());
		System.out.println("Student name: "+s1.getName());
		
	} 
	
}