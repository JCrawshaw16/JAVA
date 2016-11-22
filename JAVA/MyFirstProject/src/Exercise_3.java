import java.util.Scanner;


public class Exercise_3 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter string:");
		String word = userInput.nextLine();

		for(int i = word.length() - 1 ; i >=0 ; i--){
			System.out.print(word.charAt(i));
		}
	}

}
