import javax.swing.JOptionPane;
public class Dice
{
	private int diceFace;
	private int mBounces;
	private static int numThrow=0;
	private int avg=0;
	private int userGuess[]=new int[100];
	private int diceValue[]=new int [100];
	public Dice() 
	{
		mBounces = 1;
	}

	public Dice(int bounces) 
	{
		mBounces = bounces;
	}

	public int Throw() 
	{
		int sum = 0;
		int[] value = new int[mBounces];
		for (int a = 0; a < mBounces; a++) 
		{
			value[a] = (int) (Math.random() * 6 + 1);
			sum = sum + value[a];
		}
		diceFace = sum / mBounces;
		return diceFace;
	}

	public int value() 
	{
		return diceFace;
	}

	public int Throw(int bounces) 
	{
		int sum = 0;
		int[] value = new int[bounces];
		for (int a = 0; a < bounces; a++) 
		{
			value[a] = (int) (Math.random() * 6 + 1);
			sum = sum + value[a];
		}
		diceFace = sum / bounces;
		return diceFace;
	}
	public int Throw(int numDices,int ibounces)
	{
		numThrow=numThrow+ibounces;
		int valuedice=0;
		for (int a=0;a<numDices;a++)
		{
			valuedice=valuedice+Throw(ibounces);
		}			
		return valuedice;
	}
	static int oneThrow()
	{
		numThrow=numThrow++;
		return (int) (Math.random() * 6 + 1);
	}
	public int getNumThrow()
	{
		return numThrow; 
	}
	public void history(int user[],int computer[])
	{
		for (int a=0;a<100;a++)
		{
			userGuess[a]=user[a];
			diceValue[a]=computer[a];
		}
	}
	public void displayHistory(int games)
	{
		for (int a=0;a<games;a++)
		{
			System.out.println("User guess"+"\n"+userGuess[a]);
			System.out.println("Dice values"+"\n"+diceValue[a]);
		}
	}
}