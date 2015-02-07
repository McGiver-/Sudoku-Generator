
public class Driver {

	public static void main (String args[])
	{
		Board myBoard = new Board();
	
		for (int i=0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if (j==8)
					System.out.print(" "+ myBoard.space[i][j]+"\n");
				else
					System.out.print(" "+ myBoard.space[i][j]);;
			}
		}
	}
}
