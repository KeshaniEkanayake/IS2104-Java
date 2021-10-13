import java.util.Arrays;
class Teacher extends Person{
	private int numCourses;
	private String[] courses;
	private int maxCourses=10;
	private double baseSalary;
	
	public Teacher(String cname, String caddress){
		super(cname, caddress);
		this.numCourses=0;
		courses=new String[maxCourses];
	}

	public Teacher(String cname, String caddress, double csalary){
		super(cname, caddress);
		this.baseSalary=csalary;
	}

	public boolean addCourse(String course){
		for(int i=0; i<numCourses; ++i){
			if(courses[i].equals(course)){
				return false;
			}
		}
	
		courses[numCourses]=course;
		numCourses++;
		return true;
	}

	public void setBaseSalary(double salary){
		this.baseSalary=salary;
}	
	public void printBaseSalary(){
		System.out.println("base salary: "+this.baseSalary);
	}
}