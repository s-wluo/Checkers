
public class Game {
	public static int board[][] = new int[8][8];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generateStartPos();
		printBoard();
		
	}
	
	public static void printBoard()
	{
		System.out.println("[ ][a][b][c][d][e][f][g][h]");
		for (int i = 0; i < board.length; i++)
		{
			System.out.print("[" + (i + 1) + "]");
			for (int j = 0; j < board.length; j++)
			{
				
				if (board[i][j] == 0)
				{
					System.out.print("[ ]");
				}
				else if (board[i][j] == 1)
				{
					System.out.print("[x]");
				}
				else if (board[i][j] == 2)
				{
					System.out.print("[o]");
				}
			}
			System.out.println();
		}
	}
	
	public static void generateStartPos()
	{
		String buttcheeks = "1b1b1b1bb1b1b1b2b1b1b1b88w1w1w1w2w1w1w1ww1w1w1w";
		
		
		decodeAndSet(buttcheeks);
	}
	public static void decodeAndSet(String position)
	{
		int pos = 0;
		int[] board1d = new int[64];
		
		if (position.length() > 64) 
		{
			position = position.substring(0, 63);
		}
		
		char[] character = position.toCharArray();
		for (int i = 0; i < position.toCharArray().length; i++)
		{
			if (pos > 63) {break;}
			if (isNumeric(String.valueOf(character[i])))
			{
				pos += Math.abs(Integer.parseInt(String.valueOf(character[i]))) - 1;
			}
			else if (character[i] == 'w')
			{
				board1d[pos] = 1;
			}
			else if (character[i] == 'b')
			{
				board1d[pos] = 2;
			}
			else
			{
				continue;
			}
			pos += 1;
			
		}
		
		
		for (int i = 0;i < board.length;i++)
		{
			for (int j = 0;j < board.length;j++)
			{
				board[i][j] = board1d[(i * board.length + j)];
			}
			
		}
	}
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	

}
