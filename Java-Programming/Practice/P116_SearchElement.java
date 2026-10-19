public class P116_SearchElement
{
    public static void main(String[] args)
    {
        int[] numbers ={10,25,40,15,30};
        int search = 25;
        boolean found = false;

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] == search)
            {
               found = true;
            }

        }
        if(found)
        {
            System.out.println(search + " is found");
        }
    }
}

