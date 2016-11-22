import java.util.Scanner;


public class Task_7 {

	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please enter an Integer: ");
		int num1 = userInput.nextInt();
		System.out.println("Please enter an Integer: ");
		int num2 = userInput.nextInt();
		System.out.println("Please enter an Integer: ");
		int num3 = userInput.nextInt();
		
		userInput.close();
		
		boolean answer = twoAsOne(num1,num2,num3);
		System.out.println("It is possible to add to of these integers together to get the third: "+ answer);

	}
	
	public static boolean twoAsOne(int a, int b, int c){
		if(a+b==c ||a+c==b || b+c==a){
			return true;
		}
		
		return false;
	}

}
