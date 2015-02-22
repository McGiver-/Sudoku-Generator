import java.io.*;

public class Driver {

	public static void main (String args[])
	{
		File toWrite = new File("C:\\Users\\George\\Desktop\\Sudoku.txt");
		for(int q=0;q<10;q++)
		{
			final int TOO_MANY_TRY =30;
			int numOfTry =0;
			boolean beginning= true;
			Board myBoard = new Board();
			int fails = 0;

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
						boolean boxCheck = myBoard.checkBox(i, j);
						while(rowCheck||colCheck||boxCheck)
						{
							myBoard.setSquare(i, j);
							rowCheck = myBoard.checkRow(i, j);
							colCheck = myBoard.checkCol(i, j);
							boxCheck = myBoard.checkBox(i, j);
							numOfTry= numOfTry+1;
							if(numOfTry>=TOO_MANY_TRY)
							{
								colCheck=false;
								rowCheck=false;
								boxCheck=false;
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
								fails++;
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

			try {
				PrintWriter write = new PrintWriter(new FileOutputStream(toWrite,true));
				for (int a=0;a<9;a++)
				{
					for (int b=0;b<9;b++)
					{
						if (b==8)
							write.println(" "+ myBoard.space[a][b]+"\n");
						else
							write.print(" "+ myBoard.space[a][b]);;
					}
				}
				write.println();
				write.close();
			} catch (FileNotFoundException e) {
				System.out.println("k so goodluck");
				e.printStackTrace();
			}

			System.out.print("\n"+fails);
			q++;
		}
	}
}

