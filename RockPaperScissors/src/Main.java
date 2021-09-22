import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        //Generates randomly the hand the computer will play, as an int 1, 2, or 3, where 1 corresponds to rock,
        // 2 to scissors, and 3 to paper.
        int CompHandCode = (int)Math.floor(Math.random()*(3)+1);

        //Sets the player hand to an int 0, will be changed according to player input. If invalid input is given,
        // then the variable will remain zero.
        int PlayerHandCode = 0;

        //Takes in a string input from the player anf converts it to all lowercase.
        Scanner PlayerInput = new Scanner(System.in);
        System.out.println("Please input the hand you wish to play -- rock, paper, or scissors: ");
        String PlayerHand = PlayerInput.nextLine().toLowerCase();

        //Checks to see what the player inputed and changes the int PlayerHandCode accordingly where 1 corresponds
        // to rock, 2 to scissors, and 3 to paper. If invalid input is given (spelling errors, something like "gun")
        // PlayerHandCode will remain as 0,a message stating invalid input has been entered will be displayed,
        //and the program will end.
        if (PlayerHand.equals("rock"))
        {
            PlayerHandCode = 1;
        }

        if (PlayerHand.equals("paper"))
        {
            PlayerHandCode = 2;
        }

        if (PlayerHand.equals("scissors"))
        {
            PlayerHandCode = 3;
        }

        if (PlayerHandCode == 0)
        {
            System.out.println("Please enter either rock, paper, or scissors.");
        }

        //Compares the hand of the player stored as the int PlayerHandCode to the hand of the computer, the
        //randomly generated int CompHandCode and decides who wins where 1 corresponds to rock, 2 to scissors,
        // and 3 to paper. Outputs and prints messge totaling the results of the game. The program then ends.
        if (PlayerHandCode == 1 && CompHandCode == 3)
        {
            System.out.println("You played rock and the computer played scissors. You win.");
        }

        if (PlayerHandCode == 1 && CompHandCode == 2)
        {
            System.out.println("You played rock and the computer played paper. You lose.");
        }

        if (PlayerHandCode == 1 && CompHandCode == 1)
        {
            System.out.println("You played rock and so did the computer. Tie game.");
        }

        if (PlayerHandCode == 2 && CompHandCode == 3)
        {
            System.out.println("You played paper and the computer played scissors. You lose.");
        }

        if (PlayerHandCode == 2 && CompHandCode == 2)
        {
            System.out.println("You played paper and so did the computer. Tie game.");
        }

        if (PlayerHandCode == 2 && CompHandCode == 1)
        {
            System.out.println("You played paper and the computer played rock. You win.");
        }

        if (PlayerHandCode == 3 && CompHandCode == 3)
        {
            System.out.println("You played scissors and so did the computer. Tie game.");
        }

        if (PlayerHandCode == 3 && CompHandCode == 2)
        {
            System.out.println("You played scissors and the computer played paper. You win.");
        }

        if (PlayerHandCode == 3 && CompHandCode == 1)
        {
            System.out.println("You played scissors and the computer played rock. You lose.");
        }
    }
}
