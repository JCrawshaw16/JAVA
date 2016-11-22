import java.util.Scanner;


public class Task_5 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please enter a temperature: ");
		int temp = userInput.nextInt();
		System.out.println("Please enter true/false depending on whether it is summer:");
		boolean isSummer = userInput.nextBoolean();
		
		userInput.close();
		
		boolean answer = squirrelPlay(temp,isSummer);
		System.out.println("The squirrels in Palo Alto are playing today: "+ answer);
		

	}
	
	public static boolean squirrelPlay(int temp, boolean isSummer){
		if(isSummer){
			if(temp>=60 && temp<=100){
				return true;
			}
		}
		
		if(temp>=60 && temp<=90){
			return true;
		}
		
		return false;
	}

}
