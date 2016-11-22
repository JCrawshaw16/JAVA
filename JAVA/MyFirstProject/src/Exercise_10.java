import java.util.Scanner;


public class Exercise_10 {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner (System.in);
		System.out.println("Enter first string:");
		String seq1 = userInput.nextLine(); 
		System.out.println("Enter second string:");
		String seq2 = userInput.nextLine();
		userInput.close();
		
		int edit_dist = levenshteinDist(seq1,seq2);
		System.out.println("The minimum number of edits is: " + edit_dist);

	}
	

	public static int levenshteinDist(String str1, String str2){
		
		int len1 = str1.length();
		int len2 = str2.length();
		//2-D array of edit distances
		int[][] d = new int[len1+1][len2+1];
		
		//Check for empty strings
		if(len1 == 0){
			return len2;
		}
		
		if(len2 == 0){
			return len1;
		}
		
		//Check to see if strings are equal
		if(str1.equals(str2)){
			return 0;
		}
		
		//Work out edit distances between string and an empty substring
		
		for(int i=0; i<=len1; i++){
			d[i][0] = i;
		}
		
		for(int j=0; j<=len2; j++){
			d[0][j] = j;
		}
		
		//Calculate edit distances for remaining grid
		for(int i = 0; i<len1; i++){
			for(int j = 0; j<len2; j++){
				
				if(str1.charAt(i)==str2.charAt(j)){
					d[i+1][j+1]=d[i][j];
				}
				
				else{
					
					int replace = d[i][j] +2;
					int insert = d[i+1][j] +1;
					int delete = d[i][j+1] +1;
					
					int min = replace > insert ? insert:replace;
					min = delete > min ? min:delete;
					d[i+1][j+1] = min;
					
				}
			}
			
		}
	
		return d[len1][len2];
				
	}
	
}
