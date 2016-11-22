import java.util.ArrayList;
import java.util.Scanner;


public class Task_8 {

	public static void main(String[] args) {
		
		Scanner userInput  = new Scanner (System.in);
		System.out.println("How many rows of Pascal triangle do you want?");
		int n = userInput.nextInt();
		
		userInput.close();
		
		for(int i = 0; i < n ; i++){
			int num=1;
			int r= i+1;
			
			for(int col = 0; col<=i; col++){
				for(int k=n; k>i; k--){
					System.out.print(" ");
				}
				if(col>0){
					num = num +(r-col)/col;
				}
				System.out.println(num);
				for(int k=n; k>i; k--){
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		

	}
	
	

}
