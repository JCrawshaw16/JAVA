import java.util.Scanner;


public class Task_6 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("How fast were you driving?");
		int speed = userInput.nextInt();
		System.out.println("It is your birthday? (true/false)");
		boolean bday = userInput.nextBoolean();
		
		userInput.close();
		
		int answer = caughtSpeeding(speed,bday);
		System.out.println(answer);
		

	}
	
	public static int caughtSpeeding(int speed, boolean bday){
		if(bday){
			if(speed<=65){
				return 0;
			}
			else if(speed<=86){
				return 1;
			}
			else{
				return 2;
			}
		}
		
		if(speed<=60){
			return 0;
		}
		else if(speed<=80){
			return 1;
		}
		else{
			return 2;
		}
	}

}
