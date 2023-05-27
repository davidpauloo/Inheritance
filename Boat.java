
 class Boat extends Vehicle{
	 
	 private String mainSailcolor;
	 
	 public Boat(double speed, String color,  double price, String mainSailcolor) {
		 super(speed,color,price);
		 this.mainSailcolor = mainSailcolor;
	 }
	 public void floatt() {
		 System.out.println("The boat is floating!");
	 }

}
