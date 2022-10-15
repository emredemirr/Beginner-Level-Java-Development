package Arrays;

public class HarmonicAverageArray
{
    public static void main(String[] args)
    {
        double[] arr = {1,2,3,4,5,6,7,8,9,10};
        double sum =0, avg=0;

        for (int i =0;i<arr.length;i++)
        {
            sum = (1/arr[i]);
            avg += sum;
        }
        System.out.println("Harmonic Average: "+ avg);
    }


}
