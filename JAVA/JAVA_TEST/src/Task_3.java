import java.util.Scanner;


public class Task_3 {

	public static void main(String[] args) {
		
		Scanner userInput  = new Scanner (System.in);
		System.out.println("Please enter a string: ");
		String word = userInput.nextLine();
		System.out.println("Please enter an integer: ");
		int num = userInput.nextInt();
		
		userInput.close();
		
		String answer = nTwice(word,num);
		System.out.println(answer);

	}
	
	public static String nTwice(String word, int n){
		
		int len = word.length();
		
		//Check to see if there is a string
		if(len==0){
			System.out.println("You have not inputted a string with any characters");
			return "";
		}
		
		//Check to see if string length is at least n
		
	if(len<n){
		System.out.println("Error choose a smaller integer or a larger word");
		return "";
	}
		
		return word.substring(0, n) + word.substring(len-n,len);
		
	}

}
