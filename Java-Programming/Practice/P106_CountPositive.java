public class P106_CountPositive
{
    public static void main(String[] args)
    {
        int[] numbers = {10,-5,20,-8,15,0,25};

        int count = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]>0)
            {
              count++;
            }      
        }
        System.out.println("Positive numbers: " + count);
    }
}