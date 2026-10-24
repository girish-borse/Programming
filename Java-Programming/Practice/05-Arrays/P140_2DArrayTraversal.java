public class P140_2DArrayTraversal
{
    public static void main(String[] args)
    {
        //declared array
        int[][] numbers =
        {
           {10,20,30},
           {40,50,60},
           {70,80,90}   
        };
          //Traverse array
           for(int i=0; i<numbers.length; i++)
           {
            //access elements
             for(int j=0; j<numbers[i].length; j++)
             {
               System.out.println(numbers[i][j]);
             }
           }
    }
}