import java.util.Arrays;

public class Main
{
    static int[] AddInt(int[] Array)
    {
        int ArrayLength = Array.length;

        int[] NewArray = new int[ArrayLength + 1];

        for (int i = 0; i < ArrayLength; i++)
        {
            NewArray[i] = Array[i];
        }

        NewArray[ArrayLength] = 4;

        return NewArray;
    }

    static int[] DeleteInt(int[] Array)
    {
        int ArrayLength = Array.length;

        int[] NewArray = new int[ArrayLength - 1];

        for (int i = 0; i < ArrayLength - 1; i++)
        {
            NewArray[i] = Array[i];
        }

        return NewArray;
    }

    static int[] InsertInt(int[] Array, int InsertKey, int Insert)
    {
        int ArrayLength = Array.length;

        int[] NewArray = new int[ArrayLength + 1];

        for (int i = 0; i <= InsertKey; i++)
        {
            NewArray[i] = Array[i];

            if (i == InsertKey)
            {
                NewArray[i] = Insert;
            }
        }

        for (int i = InsertKey + 1; i < ArrayLength + 1; i++)
        {
            NewArray[i] = Array[i - 1];
        }

        return NewArray;
    }

    public static void main(String args[])
    {
        int[] numbers = {1,2,3};

        int[] x = AddInt(numbers);

        int[] y = DeleteInt(numbers);

        int[] z = InsertInt(numbers, 1, 7);

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(z));
    }
}
