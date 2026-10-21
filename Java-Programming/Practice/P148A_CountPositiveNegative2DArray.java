public class P148A_CountPositiveNegative2DArray
{
   static int[] countPositiveNegative(int[][] numbers)
    {
        int positiveCount = 0;;
         int negativeCount = 0;

        
         for(int i=0; i<numbers.length; i++)
         {
            for(int j=0; j<numbers[i].length; j++)
            {
                if(numbers[i][j] > 0)
                {
                    positiveCount++;
                }
                else if(numbers[i][j] < 0)
                {
                    negativeCount++;
                }
            }
        }
         return new int[] {positiveCount, negativeCount};
    }
    
   public static void main(String[] args)
    {

        int[][] numbers =
        {
            {10,-20,30},
            {-40,50,-60},
            {70,-80,90}

        };
       

        int[] result = countPositiveNegative(numbers);
       
         System.out.println("Number of positive count: " + result[0]);
        System.out.println("Number of negative count: " + result[1]);
        
         
    }
}
