public class P153_Min2DArrayPractice
{
    static int findMinimum2DArray(int[][] numbers)
    {
        int min = numbers[0][0];

        for(int i=0; i<numbers.length; i++)
        {
            for(int j=0; j<numbers[i].length; j++)
            {
                if(numbers[i][j] < min)
                {
                    min = numbers[i][j];
                }
            }
        }
        return min;
    }
    
    public static void main(String[] args)
    {
        int[][] numbers = 
        {
          {10,20,30},
          {40,50,60},
          {70,80,90}

        };

       int result = findMinimum2DArray(numbers);

      System.out.println("Minimum: " + result);

    }
}