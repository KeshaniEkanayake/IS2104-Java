
public class TestPerson{
	
	public static void main(String[] args){
		System.out.println("details of students");
		System.out.println("----------");

		Student s1=new Student("Mark Fernando", "67, Colombo");
		s1.addCourseGrade("IS101",97);
		s1.addCourseGrade("IS102",68);
		s1.printGrades();
		
		System.out.println();
		System.out.println("details of Teacher");
		System.out.println("----------");
		
		
		Teacher t1=new Teacher("Lori Silva", "10/A, Colombo.");
		System.out.println(t1);
		t1.setBaseSalary(1200.0);
		t1.printBaseSalary();
		
		String courses[]={"CS101", "CS102"};
		for(String course: courses){
			if(t1.addCourse(course)){
				System.out.println("course "+course+" assigned.");
			}
			else{
				System.out.println("course "+course+" cannot be added");
			}
		}
	}
	
}