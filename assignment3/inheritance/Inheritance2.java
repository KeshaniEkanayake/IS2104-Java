//assignment 3-inheritance example 2
//parent class - Lecture
class Lecture{
	private String lectureCode;
	
	public Lecture(String lectureCode){
		this.lectureCode=lectureCode;
	}
	
	public String getLectureCode(){
		return this.lectureCode;
	}
	
	public void setLectureCode(String lectureCode){
		this.lectureCode=lectureCode;
	}	
	
	public String displayLetureDetails(){
		return "Lecture code: "+lectureCode;
	} 
}

// child class - undergraduate student
class GeneralDegreeLecture extends Lecture{
	private int noOfAssignments;
	
	public GeneralDegreeLecture(String lectureCode, int noOfAssignments){
	super(lectureCode);
	this.noOfAssignments=noOfAssignments;
	}
	
	public void printNoOfAssignments(){
		System.out.println(noOfAssignments);
	}
}


//main class
public class Inheritance2{
	public static void main(String[] args){
		GeneralDegreeLecture general1=new GeneralDegreeLecture("IS2104", 3);	
		System.out.println(general1.displayLetureDetails());
		System.out.print("No of assignments: ");
		general1.printNoOfAssignments();
	}
}