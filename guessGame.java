package in.ineuron.main;
import java.util.*;

class Guesser
{
	int guessNum;
    int i;
	int guessNum()
	{
		System.out.println("Welcome to Guess a number Game... \nEnter the range.. ");
		Scanner scan=new Scanner(System.in);
		i=scan.nextInt();
    	System.out.println("Guesser kindly guess the number in between 1 to "+ i);
		guessNum=scan.nextInt();
		if(guessNum<=0 || guessNum>i)
		    System.out.println("You have not guessed in the limit. Kindly restart and guess in the limit ");
		else
			System.out.println("Guesser has guessed a number. Let's check the luck.");
		return guessNum;    
	}	
}
class Player
{
	int guessNum1;
	int guessNum2;
	int guessNum3;
	
	int guessNum1()
	{     
 		Scanner scan=new Scanner(System.in);
		System.out.println("\nPlayer1 kindly guess the number");
		guessNum1=scan.nextInt();
		return guessNum1;
	}
	int guessNum2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player2 kindly guess the number");
		guessNum2=scan.nextInt();
		return guessNum2;
	}
	int guessNum3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player3 kindly guess the number");
		guessNum3=scan.nextInt();
		return guessNum3;
	}
	
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3; int flag=1; 
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum3();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player1 & Player2 won");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 & Player3 won");
				flag=1;
			}
			else
			{
			System.out.println("Player1 won the game");
			    flag=1;
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player2 & Player3 won");
				flag=1;
			}
			else
			{
			System.out.println("Player2 won the game");
			flag=1;
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 won the game");
			flag=1;
		}
		else
		{
			System.out.println("Game lost Try Again!");
		    if(numFromGuesser<numFromPlayer1) {
		    	System.out.println("Player1, Your guessed number is high ");
		      }
		    if(numFromGuesser>numFromPlayer1) {
		    	System.out.println("Player1, Your guessed number is low ");
		      }
		    if(numFromGuesser<numFromPlayer2) {
		    	System.out.println("Player2, Your guessed number is high ");
		      }
		    if(numFromGuesser>numFromPlayer2) {
		    	System.out.println("Player2, Your guessed number is low ");
		      }
		    if(numFromGuesser<numFromPlayer3) {
		    	System.out.println("Player3, Your guessed number is high ");
		      }
		    if(numFromGuesser>numFromPlayer3) {
		    	System.out.println("Player3, Your guessed number is low ");
		      }
			flag=0; 
		}
	}
}

public class guessGame {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare(); int count=1;
		    
		     while (u.flag==0) {	
		    	u.collectNumFromPlayers();
		    	u.compare();
		    	count++;
			}	
		     System.out.print("You took " + count + " rounds win the game");
	 }
}
