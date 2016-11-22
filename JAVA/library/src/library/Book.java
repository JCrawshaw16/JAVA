package library;


public class Book extends item {

	public String isbn;
	public static int counter=0;
	private int ID=0;
	
	Book(String mAuthor, String mTitle, String mIsbn){
		
		author = mAuthor;
		title  = mTitle;
		isbn = mIsbn;
		ID = counter++;
		
	}
	
	public void getDetails(){
		System.out.println(title);
		System.out.println(author);
	}
	
	public void enterBarcode(){
		 barcode = 'B' + Integer.toString(ID);
		 
	}
	
	public void setIsbn(String a){
		isbn = a;
	}
	
}
