public class P117_CountOccurance
{
    public static void main(String[] args)
    {
        int[] numbers = {10,25,40,25,30,25};
        int search = 25;
        int count = 0;

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] == search)
            {
                count++;
            }
        }
        System.out.println(search + " occurs " + count + " Times");
   }
}