
 class Plane extends Vehicle{
	 
	 private double wingspan1;
	 
	 public Plane(double speed, String color, double price, double wingspan1) {
		 super(speed,color,price);
		 this.wingspan1 = wingspan1;
	 }
    public void fly() {
    	System.out.println("The Plane is flying");
    }

 }
