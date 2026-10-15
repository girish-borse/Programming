public class P107_CountNegative
{
    public static void main(String[] args)
    {
        int[] numbers = {10,-5,20,-8,15,0,-12};

        int count = 0;
        for(int i = 0; i<numbers.length; i++)
        {
            if(numbers[i]<0)
            {
                count++;
            }
        }
        System.out.println("Negative numbers: " + count);
    }
}