public class P121_CountEvenOdd
{
    public static void main(String[] args)
    {
        int[] numbers = {10,25,40,15,30,7};
        int evenCount =0;
        int oddCount = 0;

        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i] % 2 == 0)
            {
                evenCount++;
            }
            if(numbers[i] % 2 != 0)
            {
                oddCount++;
            }
        }
        System.out.println("Even count is: " + evenCount);
        System.out.println("Odd count is: " + oddCount);
    }
}