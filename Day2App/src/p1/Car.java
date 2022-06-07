package p1;
         // subclass       super class (Parent)
public class Car extends Vehicle{

	private int carNumber;
	private String brandName;
	private Engine e;
	private MusicSystem ms;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Car(int carNumber, Engine e) {
		super();
		this.carNumber = carNumber;
		this.e = e;
	}



	public Car(int carNumber, String brandName, String color, Engine e, MusicSystem ms) {
		this.carNumber = carNumber;
		this.brandName = brandName;
		this.color = color;
		this.e = e;
		this.ms = ms;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}

	public MusicSystem getMs() {
		return ms;
	}


	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}


	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void costingOfCar()
	{
		if(color.equals("black"))
		{
			// +15%
		}
		
	}
	
	
	
	
}
