public class P114_FindMaxPositive
{
    public static void main(String[] args)
    {
        int[] numbers = {10,25,-5,40,15,-2,30};
        int max = 0;

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>0 && numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        System.out.println("Maximum positiver number: " + max);
    }
}