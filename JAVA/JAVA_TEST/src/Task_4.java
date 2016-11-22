import java.util.Scanner;


public class Task_4 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please enter a string: ");
		String word = userInput.nextLine();
		
		userInput.close();
		
		boolean answer = endsLy(word);
		System.out.println("The string ends in ly: "+ answer);

	}
	
	public static boolean endsLy(String word){
		int len = word.length();
		
		//Check word is long enough
		if(len<2){
			return false;
		}
		
		if(word.charAt(len-1)=='y' && word.charAt(len-2)=='l'){
			return true;
		}
		
		return false;
	}

}
