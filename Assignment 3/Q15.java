import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		String game[]= {"scissor","rock","paper"};
		System.out.println("scissor (0), rock (1), paper (2):");
		int userGuess=in.nextInt();
		int compGuess=(int)(Math.random()*3);
		if(compGuess==userGuess)
		{
			System.out.println("The computer is "+game[userGuess]+". You are "+game[userGuess]+" too. It is a draw");
		}
		else if(compGuess==0 && userGuess==1)
		{
			System.out.println("The computer is scissor. You are rock. You won");
		}
		else if(compGuess==1 && userGuess==2)
		{
			System.out.println("The computer is rock. You are paper. You won");
		}
		else if(compGuess==2 && userGuess==0)
		{
			System.out.println("The computer is paper. You are scissor. You won");
		}
		else if(compGuess==0 && userGuess==2)
		{
			System.out.println("The computer is scissor. You are paper. You lost");
		}
		else if(compGuess==1 && userGuess==0)
		{
			System.out.println("The computer is rock. You are scissor. You lost");
		}
		else if(compGuess==2 && userGuess==1)
		{
			System.out.println("The computer is paper. You are rock. You lost");
		}
	}

}
