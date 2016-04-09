abstract class Myclass2 {
	abstract void calculate(double x);

}


 class sub1 extends Myclass{
	void calculate(double x){
		System.out.println("square="+(x*x));
	}
}
 class sub2 extends Myclass{
	 void calculate(double x){
		 System.out.println("square root="+Math.sqrt(x));
	 }
 }
 class sub3 extends Myclass{
	 void calculate(double x){
		 System.out.println("cube="+(x*x*x));
	 }
 }

public class Absclssex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sub1 obj1=new sub1();
		sub2 obj2=new sub2();
		sub3 obj3=new sub3();
		
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
		
	}

}
