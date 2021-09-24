import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner PlayerInput = new Scanner(System.in);
        System.out.println("Please input a message you would like to encrypt: ");
        String message = PlayerInput.nextLine().toString();
        int length = message.length();

        System.out.println("Your message was: " + message);

        char LastChar = message.charAt(length - 1);

        message = LastChar + message.substring(0, length - 1);

        message = message + "ay";

        System.out.println("Your encrypted message is: " + message);
    }
}