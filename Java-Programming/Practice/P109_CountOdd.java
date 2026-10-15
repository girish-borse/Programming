public class P109_CountOdd
{
    public static void main(String[] args)
    {
        int[] numbers = {10,15,22,31,40,53,60};
        int count= 0;

        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i] % 2 != 0)
            {
                count++;
            }
        }
        System.out.println("Odd numbers: " + count);
    }
}