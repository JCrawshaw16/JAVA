import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;




public class Prime_Calculator {

	public static void main(String[] args) {
		int num;
		Scanner userInput = new Scanner (System.in);
		do{
			System.out.println("Enter a positive integer:");
			num = userInput.nextInt();
		}while(num < 0);
		userInput.close();
		
			
		int MAX_SIZE = num/2;
		int SQRT_MAX = (int) Math.sqrt(num);
		int counter = -1;
		byte [] primeNums = new byte[MAX_SIZE];
		long startTime = System.nanoTime();
		
	
		
	for(int i = 3; i < SQRT_MAX; i+=2){
		
		if(primeNums[i/2]==0){
				int j = (i*i)/2;
				while(j< MAX_SIZE){
					primeNums[j] = 1;
					j+=i;
				}
			}
		}
	

	for(int i=0; i<MAX_SIZE ; i++){
		if(primeNums[i]==0){
			counter++;
		}
	}
		long endTime = System.nanoTime();
		long output = endTime-startTime;
		System.out.println("The number of primes between 1 and " + num +" is " +counter + ".");		
		System.out.println("Elapsed time in milli-seconds: " + output/1000000 );
		
	}
	
		
		
	}
	

	

