import java.util.ArrayList;

public class Index
{
    public ArrayList<String> wordsList = new ArrayList<>();

    public ArrayList<Integer> getIndexes(String s)
    {
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < wordsList.size(); i++)
        {
            if (wordsList.get(i).equals(s))
            {
                indexes.add(i);
            }
        }

        return indexes;

    }
}
