
public abstract class Vehicle {
		
		protected String type;
		protected int noOfWheels;
		protected int passengerCapacity;
		protected String brand;
		protected String license;
		protected String owner;
		protected boolean working = true;
		
		protected void engineOn(){
			System.out.println("Vroom");
		}
		protected void getNoOfWheels(){
			System.out.println(noOfWheels);
		}
		protected void getPassengerCapacity(){
			System.out.println(passengerCapacity);
		}
		protected String getBrand(){
			return brand;
		}
		protected String getID(){
			return license;
		}
		protected boolean getVehicleStatus(){
			return working;
		}
		
		protected void details(){
			System.out.println("The license plate is: "+ license);
			System.out.println("The owner is: "+ owner);
			System.out.println("The vehicle is working: "+ working);
		} 
		
		
		}


