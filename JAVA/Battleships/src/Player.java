import java.util.ArrayList;


public class Player {
	
	public Grid playerGrid;
	public ArrayList<Battleship> armoury;
	
	Player(){
		armoury = new ArrayList<Battleship>();
		
	}
	
	public void placeShip(){
		
		
	}
	
	public void makeArmoury(){
		armoury.add(new Battleship(2,2,"patrol"));
		armoury.add(new Battleship(2,2,"patrol"));
		armoury.add(new Battleship(3,3,"battleship"));
		armoury.add(new Battleship(3,3,"battleship"));
		armoury.add(new Battleship(3,3,"submarine"));
		armoury.add(new Battleship(4,4,"destroyer"));
		armoury.add(new Battleship(5,5,"carrier"));
		
	}

}
