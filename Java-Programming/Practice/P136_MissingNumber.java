public class P136_MissingNumber
{
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,5,6};
        int sum = 0;
        int expectSum =0;

        for(int i=0; i<numbers.length;i++)
        {
            sum = sum + numbers[i];
                
        }
        for(int i=1; i<=numbers.length+1;i++)
        {
           expectSum = expectSum + i;
        }

        System.out.println("missing number: " + (expectSum - sum));

    }
}