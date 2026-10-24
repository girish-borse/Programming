public class P138_SortDescending
{
    public static void main(String[] args)
    {
        int[] numbers ={40,10,30,20,50};

        for(int j=0; j<numbers.length-1; j++)
        {
            for(int i=0; i<numbers.length-1; i++)
            {
                if(numbers[i] < numbers[i+1])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
        for(int i=0; i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}