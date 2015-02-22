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
	public boolean checkBox(int row,int col)
	{
		String box="number";
		boolean duplicate= false;
		if(row<3&&col<3)
			box="first";
		if(row<3&&col<6&&col>2)
			box="second";
		if(row<3&&col<9&&col>5)
			box="third";
		if(row<6&&row>2&&col<3)
			box="fourth";
		if(row<6&&row>2&&col<6&&col>2)
			box="fifth";
		if(row<6&&row>2&&col<9&&col>5)
			box="sixth";
		if(row<9&&row>5&&col<3)
			box="seventh";
		if(row<9&&row>5&&col<6&&col>2)
			box="eigth";
		if(row<9&&row>5&&col<9&&col>5)
			box="ninth";
		switch(box)
		{
		case "first":
		{
			for(int l=0;l<3;l+=3)
			{
				for(int k=0;k<3;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "second":
		{
			for(int l=0;l<3;l+=3)
			{
				for(int k=3;k<6;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "third":
		{
			for(int l=0;l<3;l+=3)
			{
				for(int k=6;k<9;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "fourth":
		{
			for(int l=3;l<6;l+=3)
			{
				for(int k=0;k<3;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "fifth":
		{
			for(int l=3;l<6;l+=3)
			{
				for(int k=3;k<6;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "sixth":
		{
			for(int l=3;l<6;l+=3)
			{
				for(int k=6;k<9;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "seventh":
		{
			for(int l=6;l<9;l+=3)
			{
				for(int k=0;k<3;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "eigth":
		{
			for(int l=6;l<9;l+=3)
			{
				for(int k=3;k<6;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		case "ninth":
		{
			for(int l=6;l<9;l+=3)
			{
				for(int k=6;k<9;k+=3)
				{
					for (int i=l;i<3+l;i++)
					{
						for(int j=k;j<3+k;j++)
						{
							if (row==i&&col==j)
							{

							}
							else
								if(this.space[row][col]==this.space[i][j])
								{
									duplicate = true;
								}
						}
					}
				}
			}
		}
		break;
		default :
		{
			System.out.println("Problem with box algorithm");
			System.exit(0);
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















