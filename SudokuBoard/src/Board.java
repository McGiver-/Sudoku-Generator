import java.util.Random;
public class Board
{
	Random rand = new Random();
	public int [][] space = new int[9][9];
	final static int LINE_LENGTH = 9;

	public Board()
	{

	}
	public Board(int x)
	{
		for (int i = 0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if (i+j>8)
				{
					this.space[i][j]=j+1+i-LINE_LENGTH;
				}
				else
					this.space[i][j]=j+1+i;
			}
		}
	}

	public void setSquare(int row,int col)
	{
		this.space[row][col]=rand.nextInt(LINE_LENGTH)+1;
	}

	public boolean checkRow(int row,int col)
	{
		boolean duplicate= false;
		for (int j=0;j<LINE_LENGTH;j++)
		{
			if (col==j)
			{

			}
			else
				if(this.space[row][col]==this.space[row][j])
				{
					duplicate= true;
				}
		}
		return duplicate;
	}
	public boolean checkCol(int row,int col)
	{
		boolean duplicate= false;
		for (int j=0;j<LINE_LENGTH;j++)
		{
			if (row==j)
			{

			}
			else
				if(this.space[row][col]==this.space[j][col])
				{
					duplicate= true;
				}
		}
		return duplicate;
	}
	/*public void generate()
	{
		final int TOO_MANY_TRY =10;
		int numOfTry =0;

		for(int i=0;i<LINE_LENGTH;i++)
		{
			for (int j=0;j<LINE_LENGTH;j++)
			{	
				this.setSquare(i, j);
				boolean rowCheck = checkRow(i, j);
				boolean colCheck = checkCol(i, j);
				while(rowCheck||colCheck)
				{
					this.setSquare(i, j);
					numOfTry= numOfTry+1;
					if(numOfTry>=TOO_MANY_TRY)
					{
						colCheck=false;
						rowCheck=false;
						i=i+LINE_LENGTH;
						j=j+LINE_LENGTH;

					}
				}
			}
		}
		if(numOfTry>=TOO_MANY_TRY)
		{
			this.generate();
		}
	}
	 */
}















