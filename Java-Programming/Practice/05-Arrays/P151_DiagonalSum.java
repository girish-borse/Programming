public class P151_DiagonalSum
{
    public static void main(String[] args)
    {
        int[][] numbers = 
        {
          {10,20,30},
          {40,50,60},
          {70,80,90}

        };

        int sum = 0;
        int sum2 = 0;
        for(int i =0; i<numbers.length; i++)
        {
            for(int j=0; j<numbers[i].length; j++)
            {
                if(i == j)
                {
                    sum = sum + numbers[i][j];
                }
                if(i + j == 2)
                {
                    sum2 = sum2 + numbers[i][j];
                }
            }
            
        }
        System.out.println("Sum of both diagonals: " + (sum + sum2));
        
    }
}