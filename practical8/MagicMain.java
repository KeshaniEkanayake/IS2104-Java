//overloading
class MathsMagic{
	static int doMagic(int x, int y){
		return x+y;
	}
	
	static double doMagic(double x, double y){
		return x*y;
	}
}

public class MagicMain{
	public static void main(String[] args){
		System.out.println(MathsMagic.doMagic(10,5));
		System.out.println(MathsMagic.doMagic(5.5, 4.5));
		
		
	}
}