package p1;

public class CarApp {
	public static void main(String[] args) {
		
		Engine e = new Engine();
		e.setPower(1200);
		
		MusicSystem abc = new MusicSystem();
		abc.setBrandName("Sony");
		
		Car honda = new Car();
		honda.setBrandName("Honda-CRV");
		honda.setCarNumber(123);
		honda.setColor("Black");
		honda.setE(e);
		honda.setMs(abc);
		
		
		Engine e2 = new Engine();
		e2.setPower(1800);
		
		honda.setE(e2);
		
		Car kia =new Car(1457, e);
		
		System.out.println("Power of Honda Car "+honda.getE().getPower());
		
	}

}
