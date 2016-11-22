import java.util.Scanner;


public class Exercise_9 {

	
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.println("Enter first string: ");
		String seq1 = userInput.nextLine();
		System.out.println("Enter second string: ");
		String seq2 = userInput.nextLine();
		
		userInput.close();

	String sequence = lcsCheck(seq1,seq2);	
	System.out.println(sequence);
		
	}
	
	public static String lcsCheck(String str1, String str2){
		
				
		//Calculate word lengths
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		//Check to see if there are words to compare, if not exit program
		
		if(len1==0 || len2==0){
			return "";
		}
		
		//Check to see if last character is the same and exit the program
		
		else if(str1.charAt(len1-1)==str2.charAt(len2-1)){
			return lcsCheck(str1.substring(0, len1-1), str2.substring(0,len2-1))+str1.charAt(len1-1);
		}
		
		// Compare str1 against str2 and take the largest subsequence 
		
		else{
			String x = lcsCheck(str1, str2.substring(0, len2-1));
			String y = lcsCheck(str1.substring(0,len1-1),str2);
			
			return (x.length() > y.length() ? x:y);
			
		}
	}

}
