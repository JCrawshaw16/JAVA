
public class Exercise_5 {

	public static void main(String[] args) {
		Car c  = new Car("Josh", "YW08 LRJ", 4);
		Bike b = new Bike("Mike", "HE7 SUP");
		Lorry l = new Lorry("Jay", "HR50 TYR");
		Garage Berkley = new Garage();
		Berkley.addVehicle(c);
		Berkley.addVehicle(b);
		Berkley.checkVehicleList();
		Berkley.addVehicle(l);
		Berkley.calculateBill(l);

		

	}

}
