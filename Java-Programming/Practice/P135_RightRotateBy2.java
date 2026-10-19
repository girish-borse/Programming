public class P135_RightRotateBy2
{
    public static void main(String[] args)
    {
        int[] numbers = {10,20,30,40,50};
        int last = numbers[numbers.length-1];
        int secondLast = numbers[numbers.length-2];

        for(int i=numbers.length-1; i>=2; i--)
        {
            numbers[i] = numbers[i-2];
        }
        numbers[0] = secondLast;
        numbers[1] = last;
        
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }

    }
}