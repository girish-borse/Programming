public class P131_PairSum
{
    public static void main(String[] args)
    {
        int[] numbers = {10,20,30,40,50};
        int pairSum = 70;

        for(int i=0; i<numbers.length;i++)
        {
            for(int j=i+1; j<numbers.length;j++)
            {
                if(numbers[i] + numbers[j] == pairSum)
                {
                  System.out.println(numbers[i] + " + " + numbers[j] + " = " + pairSum);
                }
                
            }
            
        }
        
    }
}