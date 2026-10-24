public class P130_SecondSmallestNumber
{
    public static void main(String[] args)
    {
        int[] numbers = {10,40,25,60,30};
        int min = numbers[0];
        int secondMin = numbers[1];

        for(int i=1; i<numbers.length;i++)
        {
            if(numbers[i] < min)
            {
                secondMin = min;
                min = numbers[i];
            }   
            else if(numbers[i] < secondMin)
            {
                secondMin = numbers[i];
            }
        }
      System.out.println("Second Smallest number: " + secondMin);
    }
}