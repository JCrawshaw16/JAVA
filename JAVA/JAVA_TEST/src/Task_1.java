import java.util.Scanner;


public class Task_1 {

	public static void main(String[] args) {
		int [] nums = new int [3];
		Scanner userInput = new Scanner (System.in);
		for(int i = 0 ; i<3; i++){
		do{
			System.out.println("Please enter an integer:");
			nums[i] = userInput.nextInt();
		}while(nums[i]<0);
		
		}
		userInput.close();
		
		int answer = loneSum(nums[0],nums[1],nums[2]);
		System.out.println("The answer is: "+ answer);
		
		
		

	}
	
	public static int loneSum(int a , int b, int c){
		//degenerate case first
		if(a==b && b==c){
			return 0;
		}
		
		if(a==b){
			return c;
		}
		
		if(b==c){
			return a;
		}
		
		if(a==c){
			return b;
		}
		
		return a+b+c;
	}

}
