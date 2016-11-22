import java.util.ArrayList;


public class Garage {
	
	ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
	
	Garage(){
		
	}
	
	public void addVehicle(Vehicle vehc){
		vehc.working = false;
		inventory.add(vehc);
		
	}
	
	public void removeVehicle(Vehicle vehc){
		
		vehc.working = true;
		inventory.remove(vehc);
		
	}
	
	public void searchVehicle(String ID){
		for(Vehicle vehcs: inventory){
			if(vehcs.license.equals(ID)){
				System.out.println("Vehicle found");
				return;
			}
			}
		System.out.println("There is no such vehicle in the garage");	
		}
		
	
	public void costs(Vehicle vehc){
		switch(vehc.type){
		case "Car":
			System.out.println("Cost: £150.00");
			break;
		case "Bike":
			System.out.println("Cost: £100.00");
			break;
		case "Lorry":
			System.out.println("Cost: £250.00");
			break;
		default:
			System.out.println("I'm afraid we don't have a pricing structure for this vehicle yet!");
			break;
		}
	
		
	}
	
	public void calculateBill(Vehicle vehc){
		removeVehicle(vehc);
		costs(vehc);
	}
	
	public void checkVehicleList(){
				
		if(inventory.size()==0){
			System.out.println("There are no vehicles in the garage.");
		}
		
		if(inventory.size()==1){
			System.out.println("There is 1 Vehicle currently in the garage");
		}
		
		if(inventory.size()>1){
		System.out.println("There are " + inventory.size() + " Vehicles currently in the Garage");
		System.out.println("There license plate and owners are:");
		
		for(Vehicle vehc: inventory){
			System.out.println(vehc.license + ", " +vehc.owner);
		}
		
		}
	}
	
	
	public void emptyGarage(){
		inventory.clear();
	}

}
