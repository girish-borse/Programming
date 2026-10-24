public class P105_ArrayMinimum
{
    public static void main(String[] args)
    {
        int[] numbers = {35,12,48,7,25};

        int min = numbers[0];

        for(int i=1; i<numbers.length; i++)
        {
            if(numbers[i] < min)
            {
                min = numbers[i];
            }
        }
        System.out.println("Minimum: " + min);
    }
}