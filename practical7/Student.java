class Student extends Person{
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private int maxCourses=20;
	
	public Student(String cname, String caddress){
		super(cname,caddress);
		this.numCourses=0;
		courses=new String[maxCourses];
		grades=new int[maxCourses];
	}
	
	public void addCourseGrade(String course, int grade){
		courses[numCourses]=course;
		grades[numCourses]=grade;
		numCourses++;
	}
	
	public void printGrades(){
		System.out.println(this);
		for(int i=0; i<numCourses; i++){
			System.out.println("course: "+courses[i]+": "+"Grade: "+grades[i]);
		}
	}
}