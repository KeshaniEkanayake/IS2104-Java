class Person{
		public int nic;
		public String name;
		public double height;
		public double weight;
		public int salary;
		
		public void setPersonDetails(int nic, String name, double  height, double weight){ 
			
			this.nic=nic;		//this=nic which is defined in Person class.
			this.name=name;
			this.height=height;
			this.weight=weight;
		}
		
		/////////the following method is also possible instead of the above method////////
		
		/*
		public void setPersonDetails(int newNic, String newName, double  newHeight, double newWeight){ 
			
			this.nic=newNic;		//this=nic which is defined in Person class.
			this.name=newName;
			this.height=newHeight;
			this.weight=newWeight;
		}
		*/
		
		public void showPersonalDetails(){
			System.out.println("NIC: "+this.nic);
			System.out.println("Name: "+this.name);
			System.out.println("Height: "+this.height);
			System.out.println("Weight: "+this.weight);
		}
		
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
			
		p1.setPersonDetails(23456, "Bob", 6.5, 57.6);
		p2.setPersonDetails(34567, "Cindy", 4.8, 45.1);
		
		p1.showPersonalDetails();
		System.out.println();
		p2.showPersonalDetails();
		
  }
}



