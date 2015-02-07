

public class Driver {

	public static void main (String args[])
	{
		final int TOO_MANY_TRY =100;
		int numOfTry =0;
		boolean beginning= true;
		Board myBoard = new Board();
		while (beginning)
		{		
			for(int i=0;i<Board.LINE_LENGTH;i++)
			{
				for (int j=0;j<Board.LINE_LENGTH;j++)
				{	
					numOfTry=0;
					myBoard.setSquare(i, j);
					boolean rowCheck = myBoard.checkRow(i, j);
					boolean colCheck = myBoard.checkCol(i, j);
					while(rowCheck||colCheck)
					{
						myBoard.setSquare(i, j);
						rowCheck = myBoard.checkRow(i, j);
						colCheck = myBoard.checkCol(i, j);
						numOfTry= numOfTry+1;
						if(numOfTry>=TOO_MANY_TRY)
						{
							colCheck=false;
							rowCheck=false;
							i=i+Board.LINE_LENGTH;
							j=j+Board.LINE_LENGTH;

							for (int a=0;a<9;a++)
							{
								for (int b=0;b<9;b++)
								{
									if (b==8)
										System.out.print(" "+ myBoard.space[a][b]+"\n");
									else
										System.out.print(" "+ myBoard.space[a][b]);;
								}
							}
							System.out.println();
							myBoard =null;
							myBoard = new Board();
						}
					}
				}
			}
			if(numOfTry>=TOO_MANY_TRY)
				beginning = true;
			else
				beginning=false;
		}
		for (int a=0;a<9;a++)
		{
			for (int b=0;b<9;b++)
			{
				if (b==8)
					System.out.print(" "+ myBoard.space[a][b]+"\n");
				else
					System.out.print(" "+ myBoard.space[a][b]);;
			}
		}
	}
}

