import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        // the bool value Game is checked in the while loop below to determine if the game has been quit, and the ints
        // ComputerScore and PlayerScore keep track of respective scores.
        boolean Game = true;
        int ComputerScore = 0;
        int PlayerScore = 0;

        //the game loop. While true, it will run until Game is changed to false and the game will exit.
        while (Game == true)
        {
            //Generates randomly the hand the computer will play, as an int 1, 2, or 3, where 1 corresponds to rock,
            // 2 to scissors, and 3 to paper.
            int CompHandCode = (int)Math.floor(Math.random()*(3)+1);

            //Sets the player hand to an int 0, will be changed according to player input. If invalid input is given,
            // then the variable will remain zero.
            int PlayerHandCode = 0;

            //Takes in a string input from the player and converts it to all lowercase (avoids caps errors).
            Scanner PlayerInput = new Scanner(System.in);
            System.out.println("Please input the hand you wish to play -- rock, paper, or scissors: ");
            System.out.println("If you would like to exit enter quit.");
            String PlayerHand = PlayerInput.nextLine().toLowerCase();

            //Checks to see what the player inputed and changes the int PlayerHandCode accordingly where 1 corresponds
            // to rock, 2 to scissors, and 3 to paper. If invalid input is given (spelling errors, something like "gun")
            // PlayerHandCode will remain as 0,a message stating invalid input has been entered will be displayed,
            //and the program will end. If "quit" is entered, the program will exit the while loop by changing the bool
            // Game to false.
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

            //PlayerHandCode was set to 4 so that the message
            // "Please enter either rock, paper, or scissors. If you would like to exit enter quit." will not display.
            // It does not change anything else.
            // When quit is entered, the bool Game changes to false and the loop is exited. The program then ends.

            if (PlayerHand.equals("quit"))
            {
                Game = false;
                PlayerHandCode = 4;
            }

            if (PlayerHandCode == 0)
            {
                System.out.println("You entered an invalid value. Please enter either rock, paper, or scissors. If you would like to exit enter quit.");
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
            }

            //Compares the hand of the player stored as the int PlayerHandCode to the hand of the computer, the
            //randomly generated int CompHandCode and decides who wins where 1 corresponds to rock, 2 to scissors,
            // and 3 to paper. Outputs and prints message totaling the results of the game, and the scoreboard. Then
            // the while loop will repeat.
            if (PlayerHandCode == 1 && CompHandCode == 3)
            {
                System.out.println("You played rock and the computer played scissors. You win.");
                PlayerScore++;
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 1 && CompHandCode == 2)
            {
                System.out.println("You played rock and the computer played paper. You lose.");
                ComputerScore++;
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 1 && CompHandCode == 1)
            {
                System.out.println("You played rock and so did the computer. Tie game.");
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 2 && CompHandCode == 3)
            {
                System.out.println("You played paper and the computer played scissors. You lose.");
                ComputerScore++;
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 2 && CompHandCode == 2)
            {
                System.out.println("You played paper and so did the computer. Tie game.");
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 2 && CompHandCode == 1)
            {
                System.out.println("You played paper and the computer played rock. You win.");
                PlayerScore++;
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 3 && CompHandCode == 3)
            {
                System.out.println("You played scissors and so did the computer. Tie game.");
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 3 && CompHandCode == 2)
            {
                System.out.println("You played scissors and the computer played paper. You win.");
                PlayerScore++;
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }

            if (PlayerHandCode == 3 && CompHandCode == 1)
            {
                System.out.println("You played scissors and the computer played rock. You lose.");
                ComputerScore++;
                System.out.println("The score currently is -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
                System.out.println("---------------------------------------------------------------------------------");
            }
        }

        //Prints the final scoreboard before the program ends.
        System.out.println("Thanks for playing. The final score was -- Player: " + PlayerScore + ", Computer: " + ComputerScore);
    }
}
