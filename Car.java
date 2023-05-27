
class Car extends Vehicle {
	
	private String tiretype;
	
	public Car (double speed, String color, double price, String tiretype) {
		super(speed,color,price);
		this.tiretype = tiretype;
	}
	
	public void drive() {
		System.out.println("Car is driving!");
	}

}