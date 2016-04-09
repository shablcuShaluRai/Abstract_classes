class Myclass {
	void calculate(double x) {
		System.out.println("square=" + (x * x));
	}
}

public class Common {

	public static void main(String[] args) {

		Myclass obj1 = new Myclass();
		Myclass obj2 = new Myclass();
		Myclass obj3 = new Myclass();
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);

	}

}
