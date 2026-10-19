public class P129_UniqueElement
{
    public static void main(String[] args)
    {
        int[] numbers = {10,20,30,20,40,10};

        for(int i=0; i<numbers.length;i++)
        {
            int count = 0;
            for(int j=0; j<numbers.length;j++)
            {
                if(numbers[i] == numbers[j])
                {
                    count++;
                }
            }

            if(count == 1)
            {
              System.out.println("Unique element: " + numbers[i]);
            }
        }
    }
} 
