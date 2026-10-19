public class P118_FirstOccurance
{
    public static void main(String[] args)
    {
        int[] numbers = {10,25,40,25,30,25};
        int search = 25;
        int index = 0;

        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i]==search)
            {
                index = i;
                break;
            }
        }
        System.out.println("First Occurance of " + search + " index is at " + index);
    }
}