
public class Board
{
	int [][] space = new int[9][9];
	static int k = 9;
	public Board()
	{
		for (int i = 0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if (i+j>8)
				{
					this.space[i][j]=j+1+i-k;
				}
				else
					this.space[i][j]=j+1+i;
			}
		}
	}
	
}
