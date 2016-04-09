abstract class Car {
	int regno;

	Car(int r) {
		regno = r;

	}

	void tank() {
		System.out.println("fill the tank");
	}

	abstract void steerng(int direction, int angle);

	abstract void braking(int force);
}

class Maruti extends Car {

	Maruti(int r) {
		super(r);

	}

	void steerng(int direction, int angle) {

		System.out.println("take a turn");
		System.out.println("this is ordinary steering");

	}

	void braking(int force) {
		System.out.println("brakes apply");
		System.out.println("this is hydraulic breaks");

	}

}

class Santro extends Car {
	Santro(int r) {
		super(r);

	}

	void steerng(int direction, int angle) {
		System.out.println("Take a turn");
		System.out.println("this car uses power steering");
	}

	void braking(int force) {
		System.out.println("Brakes Applied");
		System.out.println("this car uses gas breaks");

	}

}

public class Abstrctclass {

	
	public static void main(String[] args) {
		
		
		Maruti m=new Maruti(1001);
		Santro s=new Santro(5005);
		//Car ref;
		//ref=m;
		//ref.tank();
		m.tank();
		m.steerng(20, 135);
		s.braking(500);
		
	}

}
