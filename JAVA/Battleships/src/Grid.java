
public class Grid {

	public int size;
	public String [][] board;
		
	Grid(int n){
		size = n;
		 board = new String[size][size];
	}
	
	
	
	public void makeBoard(){
		char letter ='A';
		for(int row = 0; row<size; row++){
			
			for(int col=0; col<size; col++){
				
				board[row][col]= letter + Integer.toString(col+1);
			}
			
			letter++;
		}
	}
	
	public void checkBoard(){
		for(int row=0; row<size; row++){
			for(int col=0; col<size; col++){
				System.out.print(board[col][row]+ " ");
			}
			System.out.println();
			
		}
	}
	

	
}
