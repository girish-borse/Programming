public class P40_WhileIfPractice
{
   public static void main(String[] args)
   {

    int i = 1;
    while(i<=10)                  //repeat
    {
        if(i % 2 == 0)           //decision
        {
            System.out.println(i);
        
        }
        i++;                    //move forward
    }
   }
}