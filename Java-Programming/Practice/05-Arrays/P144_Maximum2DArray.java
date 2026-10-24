public class P144_Maximum2DArray
{
    public static void main(String[] args)
    {
        int[][] numbers =
        {
          {10,20,30},
          {40,50,60},
          {70,80,90}

        };

        int max = 0;

        for(int i=0; i<numbers.length; i++)
        {
            for(int j=0; j<numbers[i].length; j++)
            {
                if(numbers[i][j] > max)
                {
                    max = numbers[i][j];
                }
            }
            
        }
        System.out.println(max);
    }
}