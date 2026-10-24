public class P147_CountEvenOddArray
{
  public static void main(String[] args)
  {
      int[][] numbers = 
      {
        {10,20,31},
        {40,51,60},
        {70,81,90}

      };
      int evenCount = 0;
      int oddCount = 0;

      for(int i=0; i<numbers.length; i++)
      {
        for(int j=0; j<numbers[i].length; j++)
        {
            if(numbers[i][j] % 2 == 0)
            {
                evenCount++;
            }
            else if(numbers[i][j] % 2 != 0)
            {
                oddCount++;
            }     
         }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
      }
      
}