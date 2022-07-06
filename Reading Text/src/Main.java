import javax.swing.text.Style;
import java.io.*;
import java.util.ArrayList;

public class Main
{
    private static Index index = new Index();

    public static void main(String args[]) throws IOException {

        FileInputStream fstream = new FileInputStream("src/ProgrammingHistory.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = br.readLine()) != null)
        {
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++)
            {
                System.out.println(words[i]);
                index.wordsList.add(words[i]);
            }
        }

        ArrayList<Integer> indexes = index.getIndexes("Programmable");

        for (int i=0; i<indexes.size(); i++)
        {
            System.out.println(indexes.get(i));
        }

    }


}
