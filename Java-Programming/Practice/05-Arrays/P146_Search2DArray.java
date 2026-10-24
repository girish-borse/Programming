public class P146_Search2DArray
{
    public static void main(String[] args)
    {
        int[][] numbers =
        {
            {10,20,30},
            {40,50,60},
            {70,80,90}

        };

        int search = 50;
        boolean found = false;

        for(int i=0; i<numbers.length; i++)
        {
            for(int j=0; j<numbers[i].length; j++)
            {
                if(search == numbers[i][j])
                {
                    found = true;
                }
            }
        }
        if(found)
        {
          System.out.println(search + " is found ");
        }
        else
        {
            System.out.println(search + " is not found ");
        }
        
    }
}