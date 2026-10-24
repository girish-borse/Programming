public class P108_CountEven
{
    public static void main(String[] args)
    {
        int[] numbers = {10,15,22,31,40,53,60};
        int count = 0;

        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i] % 2 == 0)
            {
                count++;
            }
        }
        System.out.println("Even numbers: " + count);
    }
}