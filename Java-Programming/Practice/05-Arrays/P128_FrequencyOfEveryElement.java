public class P128_FrequencyOfEveryElement
{
    public static void main(String[] args)
    {
        int[] numbers ={10,20,30,20,40,10};

        for(int i=0; i<numbers.length; i++)
        {
            int count = 0;
            for(int j=0; j<numbers.length;j++)
            {
               if(numbers[i] == numbers[j])
               {
                 count++;   
               }
            }
            System.out.println(numbers[i] + " Occurs " + count + " times ");
        }
    }
}