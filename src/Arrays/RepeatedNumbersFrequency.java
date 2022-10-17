package Arrays;

public class RepeatedNumbersFrequency
{
    public static void main(String[] args)
    {
        int[] arr = {15, 10, 20, 20, 10, 10, 15, 20, 5, 5, 6, 6, 6, 20};
        int[] frequency = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            frequency[i] = 1;
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if ((i != j) && (arr[i] == arr[j]))
                {
                    frequency[i]++;
                    arr[j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (frequency[i] > 1 && arr[i] != 0)
                System.out.println(arr[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
        }

    }
}
