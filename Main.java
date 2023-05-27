
public class Main {

	public static void main(String[] args) {
		ToyotaVios toyotaVios = new ToyotaVios(90,"Black", 600000,"High performance tire");
		toyotaVios.drive();
		System.out.println("The Car's Speed: " + toyotaVios.getSpeed() + " kmph ");
		System.out.println("The Car's Color: " + toyotaVios.getColor());
		System.out.println("The Car's Price: " + toyotaVios.getPrice() + " Php ");
		
		toyotaVios.stop();
		
		
		System.out.println(" ----------------------- ");
		
       FandangoYatch fandangoYatch = new FandangoYatch(50,"Pearl", 1000000, "White");
       fandangoYatch.floatt();
       System.out.println("The Boat's Speed: " + fandangoYatch.getSpeed() + " kmph ");
       System.out.println("The Boat's Price: " + fandangoYatch.getPrice() + " Php ");
       System.out.println("The Boat's Color: " + fandangoYatch.getColor());
       
       fandangoYatch.stop();
       
       
       System.out.println(" ----------------------- ");
       
       U2SpyPlane u2spyplane = new U2SpyPlane(140,"Black", 5000000, 31);
       u2spyplane.fly();
       System.out.println("The Plane's Speed: " + u2spyplane.getSpeed() + " kmph ");
       System.out.println("The Plane's Color: " + u2spyplane.getColor());
       System.out.println("The Plane's Price: " + u2spyplane.getPrice() + " Php ");
       
       u2spyplane.stop();
       
       
	}

}
