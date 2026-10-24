public class P125_SecondLargestNumber
{
    public static void main(String[] args)
    {
        int[] numbers ={10,40,25,60,30};

        int max = numbers[0];
        int secondMax = numbers[0];

        for(int i=1; i<numbers.length; i++)
        {
            if(numbers[i]>max)
            {   
              secondMax = max;
              max = numbers[i];
            }
            else if(numbers[i] > secondMax)
            {
                secondMax = numbers[i];
            }
        }
        System.out.println("Second largest number: " + secondMax);

    }
}