
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
		String buttcheeks = "1w1w1w1w1w";//"1b1b1b1bb1b1b1b11b1b1b1b88w1w1w1w1w11w1w1w1ww1w1w1w11";
		
		
		decodeAndSet(buttcheeks);
	}
	public static void decodeAndSet(String position)
	{
		int x = 1;
		int y = 1;
		for (char character : position.toCharArray())
		{

			if (isNumeric(String.valueOf(character)))
			{
				if (y > 8)
				{
					y = y % 8;
					x += y / 8;
					System.out.println(y);
				}
				
				y += Integer.parseInt(String.valueOf(character));

				
			}
			else if (character == 'w')
			{
				board[x - 1][y - 1] = 1;
				y += 1;
				
			}
			else if (character == 'b')
			{
				board[x - 1][y - 1] = 2;
				y += 1;
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
