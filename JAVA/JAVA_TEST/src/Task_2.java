import java.util.Scanner;


public class Task_2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner userInput  = new Scanner (System.in);
		do{
		System.out.println("Please enter an integer: ");
		num1 = userInput.nextInt();}while(num1<0);
		do{
		System.out.println("Please enter another integer: ");
		num2 = userInput.nextInt();}while(num2<0);
		
		userInput.close();
		
		int answer = blackJack(num1,num2);
		System.out.println("The nearest integer to 21 is: " +answer);
	}
	
	
	
	public static int blackJack(int a, int b){
		
			
		if(a>21 && b>21){
			return 0;
		}
		
		if(a>21){
			return b;
		}
		
		if(b>21){
			return a;
		}
		
		
		return a>b ? a:b;
		
		
		
	}

}
