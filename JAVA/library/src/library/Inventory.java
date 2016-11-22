package library;

import java.util.ArrayList;

public class Inventory {
	
	ArrayList<item> inventory = new ArrayList<item>();
	
	public void addItem(item a){
		
		a.enterBarcode();
		inventory.add(a);
		
	}
	
	public void removeItem(item a){
		inventory.remove(a);
	}
	
	public void updateItem(String search){
		boolean itemFound = false;
		item libItem;
		for(item a: inventory){
			if(a.getBarcode().toLowerCase().equals(search.toLowerCase())){
				libItem =a;
				itemFound = true;
				return;
			}
		}
		if(!itemFound){
			System.out.println("There is no such item in the system!");
			return;
		}
		
		
		
	}
		
	public void searchItem(String search){
		boolean itemFound = false;
		for(item a: inventory){
			if(a.getBarcode().toLowerCase().equals(search.toLowerCase()) || a.getTitle().toLowerCase().equals(search.toLowerCase()) || a.getAuthor().toLowerCase().equals(search.toLowerCase())){
				
				a.getDetails();
				itemFound = true;
				
			}	
		}
		if(!itemFound){
		System.out.println("There is no such item in the system!");
		}
	}
	
	Inventory(){
		
	}

}
