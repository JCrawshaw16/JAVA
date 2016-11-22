import java.util.Scanner;


public class Exercise_4 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter string:");
		String word = userInput.nextLine();
		int j = word.length() -1;
		for(int i = 0, n = word.length() ; i < n ; i++){
			System.out.print(word.charAt(j));
			j--;
		}
	}

}
