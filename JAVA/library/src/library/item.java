package library;

public abstract class item {
	
	protected String barcode;
	protected String title;
	protected String author;
	
	protected String getAuthor(){
		return author;
	}
	
	protected void setAuthor(String a){
		author = a;
	}
	
	protected String getTitle(){
		return title;
	}
	
	protected void setTitle(String a){
		title=a;
	}
	
	protected void enterBarcode(){
		
	}
	
	protected String getBarcode(){
		return barcode;
	}
	
	protected void getDetails(){
		
	}

}
