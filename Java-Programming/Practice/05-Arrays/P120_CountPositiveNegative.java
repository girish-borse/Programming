public class P120_CountPositiveNegative
{
    public static void main(String[] args)
    {
        int[] numbers = {10,-5,25,-10,30,-2};
        int positiveCount = 0;
        int negativeCount = 0;

        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i] > 0)
            {
                positiveCount++;
            }
            if(numbers[i] < 0)
            {
                negativeCount++;
            }
        }
        System.out.println("Positive Count is: " + positiveCount);
        System.out.println("Negative Count is: " + negativeCount);

    }
}