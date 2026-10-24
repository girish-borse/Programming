public class P119_LastOccurance
{
    public static void main(String[] args)
    {
        int[] numbers = {10,25,40,25,30,25};
        int search = 25;
        int index = 0;

        for(int i=0; i<numbers.length;i++)
        {
          if(numbers[i] == search)
          {
             index = i;
          }
        }
        System.out.println("Last occurance of " + search + " index is at " + index);

    }
}