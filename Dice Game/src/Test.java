import javax.swing.JOptionPane;
public class Test 
{
	public static void main(String[] args) 
	{
		int Dices;
		int games=1;
		int numThrows=0;
		int yourGuess;
		int userWins=0;
		int [] userGuess=new int[100];
		int [] compNumber=new int[100];
		String replay_1;
		String replay_2;
		String replay_3;
		String replay_4;
		Dice ndice=new Dice();
		int diceValue;
		
		JOptionPane.showMessageDialog(null, "Welcome to Dice Game");
		replay_1=JOptionPane.showInputDialog("How many dice you want to play in game?  ");
		Dices=Integer.parseInt(replay_1);	
		
		for (int a=0;a<games;a++)
		{			
			replay_2=JOptionPane.showInputDialog("How many times you want to throw dices: ");
			numThrows=Integer.parseInt(replay_2);	
			diceValue=ndice.Throw(Dices,numThrows);
			
			replay_3=JOptionPane.showInputDialog("Please guess the value: ");
			yourGuess=Integer.parseInt(replay_3);			
			if(yourGuess==diceValue)
			{
				JOptionPane.showMessageDialog(null, "Good guess");
				userWins++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Not a good guess");
			}
			userGuess[a]=yourGuess;
			compNumber[a]=diceValue;
			replay_4=JOptionPane.showInputDialog("Do you want to play more?");
			String y="yes";
			if (replay_4.equalsIgnoreCase(y))
			{
				games++;
			}	
			else
			{
				a=games;
			}
		 }
		 System.out.println("Throwing Time: "+ndice.getNumThrow());
		 ndice.history(userGuess,compNumber);
		 ndice.displayHistory(games);
		 if (userWins==games/2 & games%2==0)
		 {
			 JOptionPane.showMessageDialog(null, "Tie Game");
		 }
		 else
		 {
			 if (userWins>games/2)
			 {
				 JOptionPane.showMessageDialog(null, "You win");
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null, "you lose");
			 }
		 }
	}
}
