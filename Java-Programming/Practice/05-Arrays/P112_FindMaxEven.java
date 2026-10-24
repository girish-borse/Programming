public class P112_FindMaxEven 
{
    public static void main(String[] args)
    {
        int[] numbers = {15,28,43,64,22,51,80};
        int max =0;
        
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] % 2 == 0 && numbers[i] > max)
            {
              max = numbers[i];
            }
        }
        System.out.println("maximum Even number: " + max);
    }
}