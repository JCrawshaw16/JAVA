import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercise_7 {

	public static void main(String[] args) {
	
		int num;
		boolean prime;
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		Scanner userInput = new Scanner (System.in);
		do{
			System.out.println("Enter a positive integer:");
			num = userInput.nextInt();
		}while(num < 0);
		userInput.close();
		primeNums.add(2);
		long startTime = System.nanoTime();
		
		for(int i=3 ; i <= num; i+=2){
			prime = true;
			for(int j=3 ; j<=Math.sqrt(i); j+=2){
				if(i%j==0){
					prime = false;
					break;
				}
				
			}
			if(prime){
				primeNums.add(i);
			}
		}
		long endTime = System.nanoTime();
		long output = endTime - startTime;
	/*	for(int i:primeNums){
			System.out.println(i);
		} */
		System.out.println( primeNums.size());
		System.out.println("Elapsed time in milli-seconds: " + output/(1000000));
		
		
	}

}
