
import java.util.Scanner;

public class Exercise_2 {
	
	public static void main(String[] args) {
		int num;
		Scanner userInput = new Scanner (System.in);
		do{
			System.out.println("Enter a positive integer:");
			num = userInput.nextInt();
		}while(num < 0);
		
		
		for(int i = 1; i < num+1 ; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
	System.out.println(" ");
		}
	}
	
	
}
