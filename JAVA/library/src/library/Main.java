package library;

public class Main {

	public static void main(String[] args) {
		
	
		
		Inventory invent = new Inventory();
		Book harryp = new Book("JK Rowling","Harry Potter and the Philospers Stone", "0000001");
		Book harryp2 = new Book("JK Rowling", "Harry Potter and the chamber of secrets","0000002");
		Book harryp3 = new Book("JK Rowling", "Harry Potter and the Prisoner of Azkaban", "0000003");
		
		invent.addItem(harryp);
		invent.addItem(harryp2);
		invent.addItem(harryp3);
		
		invent.searchItem("jk rowling");
		
	
	}

}
