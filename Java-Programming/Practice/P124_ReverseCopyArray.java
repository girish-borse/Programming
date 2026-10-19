public class P124_ReverseCopyArray
{
    public static void main(String[] args)
    {
        int[] numbers = {10,20,30,40,50};
        int[] copy = new int[numbers.length];

        //copy
        for(int i=0; i<copy.length; i++)
        {
            copy[i] = numbers[i];
        }

        //reverse copy into numbers
        int j=0;
        for(int i=copy.length-1; i>=0;i--)
        {
           numbers[j] = copy[i];
           j++;
        }
        for(int i=0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}