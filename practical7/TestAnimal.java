public class TestAnimal{
	public static void main(String[] args){
		Cat c1=new Cat("milk",4,"orange","kitty");
		
		c1.printName();
		
		System.out.println("cat eats "+c1.getEat());
		System.out.println("cat has "+c1.getNoOfLegs()+" legs");
		c1.setColor("black");
		System.out.println("cat's color is "+c1.getColor());

		Duck d1=new Duck("vegetables",2,2);
		System.out.println("Duck eats "+d1.getEat());
		System.out.println("Duck has "+d1.getNoOfLegs()+" legs");

		d1.quack();
	}
}