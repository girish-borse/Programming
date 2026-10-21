public class P142_RowWiseSum
{
    public static void main(String[] args)
    {
        int[][] numbers =
        {
            {10,20,30},
            {30,40,50},
            {60,70,80}
        };

                                                     
         for(int i=0; i<numbers.length; i++)                           //rows
        {
            int sum = 0;                                               //  reset for each row
                                                
            for(int j=0; j<numbers[i].length; j++)                     // Columns
            {
              sum = sum + numbers[i][j];                               // Current element
            }
            System.out.println("sum of row " + i + ": " + sum);       // row completed
            
        }
       
    }
}