public class P111_SumOdd
{
    public static void main(String[] args)
    {
        int[] numbers = {10,15,22,31,40,53,60};
        int sum = 0;

        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i] % 2 != 0)
            {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}