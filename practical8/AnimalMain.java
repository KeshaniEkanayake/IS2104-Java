//overriding
class Animal{
public void makeSound(){
		System.out.println();
	}
}	
	
	class Cat extends Animal{
		
		public void makeSound(){
			System.out.println("meow");
		}
	}
	
	class Dog extends Animal{
	
		public void makeSound(){
			System.out.println("Woof");
		}
	}
	
	
	class AnimalMain{
		public static void main(String[] args){
			Cat Padfoot=new Cat();
			Padfoot.makeSound();
		
			Dog Crookshanks=new Dog();
			Crookshanks.makeSound();
	}
}
	
