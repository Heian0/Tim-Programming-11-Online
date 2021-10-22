import java.util.Locale;

public class Main
{
    //Code your solution to problem number one here
    static int problemOne(String s)
    {
        int answer = 0;

        //the for loop below iterates through the string
        for (int i = 0; i < s.length(); i++)
        {
            //char c is the character at index i, it is turned into a string cString and also converted to lowercase
            char c = s.charAt(i);
            String cString = Character.toString(c);
            cString = cString.toLowerCase(Locale.ROOT);

            //here, the character in the string entered (c) is in string form (cString) and is checked if it is a vowel
            if (cString.equals("a") || cString.equals("e") || cString.equals("i") || cString.equals("o") || cString.equals("u"))
            {
                //if it is a vowel, then answer increases by one, and the loop moves on to the next character
                answer = answer + 1;
            }
        }

        //once the string has been fully iterated through and all characters have been checked if they are vowels, the answer is returned.
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s)
    {
        int answer = 0;

        //the for loop iterates through the string
        for (int i = 0; i < s.length(); i++)
        {
            //char c is the character at index i, and is then converted to string form cString and lowercase
            char c = s.charAt(i);
            String cString = Character.toString(c);
            cString = cString.toLowerCase(Locale.ROOT);

            //cBeforeString and cAfterString are the characters before and after cString, that have been converted to string type.
            String cBeforeString = "x";
            String cAfterString = "x";

            //however, if i equals 0 we can't have a before character, so the if statement here weeds that out.
            if (i != 0)
            {
                //so long as i does not equal 0, then, cBeforeString is set to the character before cString. If it does,
                //CBeforeString remains "x" which is fine because we are checking if there is a "bob" and there is no "x"
                //in "bob."
                char cBefore = s.charAt(i - 1);
                cBeforeString = Character.toString(cBefore);
                cBeforeString = cBeforeString.toLowerCase(Locale.ROOT);
            }

            //similarly, if i is at the end of the string, we cannot have a cAfterString
            if (i != s.length() - 1)
            {
                //so, as long as we are not at the end of the string cAfterString will be set to the character after cString.
                //if i does equal the last index of the string, then CAfterString remains "x" which is fine because
                // we are checking if there is a "bob" and there is no "x" in "bob."
                char cAfter = s.charAt(i + 1);
                cAfterString = Character.toString(cAfter);
                cAfterString = cAfterString.toLowerCase(Locale.ROOT);
            }

            //the if statement here checks if the character c is "o" and the ones before and after it are "b" which spell "bob."
            if (cString.equals("o") && cBeforeString.equals("b") && cAfterString.equals("b"))
            {
                //if we do have a bob in our string, our answer increases by one.
                answer = answer + 1;
            }
        }

        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s)
    {
        int CurrentLength = s.length() + 1;
        int NewLength = 0;
        String answer = "";
        String NewAnswer = "";

        //for loop iterates through the string
        for (int i = 0; i < s.length() - 1; i++)
        {
            //the chars c and cAfter are the character at index i and i + 1, which are both converted to lowercase strings and then
            //back to chars.
            char c = s.charAt(i);
            String cString = Character.toString(c);
            String cStringL = cString.toLowerCase(Locale.ROOT);
            c = cStringL.charAt(0);

            char cAfter = s.charAt(i + 1);
            String cStringAfter = Character.toString(cAfter);
            String cStringAfterL = cStringAfter.toLowerCase(Locale.ROOT);
            cAfter = cStringAfterL.charAt(0);

            //the ints Key and KeyAfter give a numerical value to the chars in the string, a would be 1, b would be 2,
            //so on and so forth.
            int Key = c - 'a' + 1;
            int KeyAfter = cAfter - 'a' + 1;

            //the if statement here checks if the chars are in alphabetical order by comparing their numeric values. If
            //they are in order, then Key must be smaller than KeyAfter.
            if (Key < KeyAfter)
            {
                //if Key must is smaller than KeyAfter, then the character cString gets added to NewAnswer, which is originally "".
                NewAnswer = NewAnswer + cString;
                //the length of our answer also increases by one, NewLength was originally defined to be 0.
                NewLength = NewLength + 1;

                //if the cString is the last char in the string, we cannot have string after. So to avoid error, the is
                //statement below is for when cString is the 2nd last in the string.
                if (i == (s.length() - 2))
                {
                    //below is the same as above.
                    cAfter = s.charAt(i + 1);
                    cStringAfter = Character.toString(cAfter);
                    cStringAfter = cStringAfter.toLowerCase(Locale.ROOT);

                    Key = c - 'a' + 1;
                    KeyAfter = cAfter - 'a' + 1;

                    if (Key < KeyAfter)
                    {
                        NewAnswer = NewAnswer + cStringAfter;
                        NewLength = NewLength + 1;
                    }
                }

                //this is if statement for when a new string in alphabetical order gets longer than the current one. Originally,
                //CurrentLength is set to the length of the string plus one so there is no way for NewLength to be larger,
                //this is so that is the entire string is in alphabetical order we don't get any errors.

                //If there are two sections in the string in alphabetical order, then this will compare the two. When the
                //new length is longer then the current length, this will run.
                if (NewLength > CurrentLength)
                {
                    //The CurrentLength then becomes the new length and the answer becomes the one we have been making.
                    CurrentLength = NewLength;
                    answer = NewAnswer;
                }
            }

            //if the next character is not in alphabetical order, then this if statement runs.
            if (Key >= KeyAfter)
            {
                //current length becomes length of our new answer
                CurrentLength = NewAnswer.length();
                //answer becomes the answer we have been building, NewAnswer
                answer = NewAnswer;
                //And then NewAnswer and NewLength are reset so we can continue iteration and see if we get
                //a longer string is alphabetical order.
                NewAnswer = "";
                NewLength = 0;
            }
        }

        //at the end of iteration, answer (longest string in alpha order) will be returned.
        return answer;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */

        String s1 = "kobe";

        String s2 = "kbobaybobbob";

        int ProblemOneAnswer = problemOne(s1);

        int ProblemTwoAnswer = problemTwo(s2);

        String ProblemThreeAnswer = problemThree("habciabcddubfjkLxz");

        System.out.println(ProblemOneAnswer);
        System.out.println(ProblemTwoAnswer);
        System.out.println(ProblemThreeAnswer);
    }
}