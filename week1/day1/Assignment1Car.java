package week1.day1;

public class Assignment1Car {

	    public void driveCar() {
			System.out.println("Drive the car");
			
		}
		public void applyBrake() 
		{
			System.out.println("Apply brake");
		}
		
		public void soundHorn() 
		{
		System.out.println("Use sound horn");	
		}
		
		public boolean isPuncture()
		{
			
		System.out.println("Check whether car is puncture or not");
		return false;
	}

		public static void main(String[] args) {
			
			Assignment1Car car=new Assignment1Car();
			
			car.driveCar();
			car.applyBrake();
			car.soundHorn();
			boolean puncture = car.isPuncture();
			System.out.println("Car tyre puncture " +"["  + puncture +"]");
			
		}

		
	}