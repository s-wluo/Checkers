
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
		String buttcheeks = "1b1b1b1bb1b1b1b11b1b1b1b88w1w1w1w1w11w1w1w1ww1w1w1w11";
		
		decodeAndSet(buttcheeks);
	}
	public static void decodeAndSet(String position)
	{
		int x = 0;
		int y = 0;
		for (char character : position.toCharArray())
		{
			if (isNumeric(String.valueOf(character)))
			{
				if (x >= 7)
				{
					x = 0;
					y += 1;
				}
				x += Integer.parseInt(String.valueOf(character)) - 1;
//			}
//			else if (character == 'w')
//			{
//				System.out.println(x);
//				System.out.println(y);
//				board[x][y] = 1;
				
//			}
//			else if (character == 'b')
//			{
//				System.out.println(x);
//				System.out.println(y);
//				board[x][y] = 2;
			}
			System.out.println("x: " + x);
			System.out.println(y);

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
