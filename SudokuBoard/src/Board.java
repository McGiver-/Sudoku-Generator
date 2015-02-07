import java.util.Random;
public class Board
{
	Random rand = new Random();
	int [][] space = new int[9][9];
	final static int LINE_LENGTH = 9;
	
	
	public Board()
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
	
	public void fillSquare(int row,int col)
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
}
