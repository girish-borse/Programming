public class P115_FindMinPositive
{
    public static void main(String[] args)
    {
        int[] numbers = {10,25,-5,40,15,-2,30};

        int min = 0;
        boolean found = false;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>0 &&(!found || numbers[i] < min))
            {
                min = numbers[i];
                found = true;
            }
        }
        System.out.println("Minimun positive number: " + min);
    }
}