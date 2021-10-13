class Person{
	private String name;
	private String address;

	public Person(){
		
	}
	
	public Person(String cname, String caddress){
		this.name=cname;
		this.address=caddress;
	}
	
	public String getName(){return this.name;}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	
	public String toString(){
		return "Name: "+name+ "|"+"address: "+address;
	} 
}