public class P27_ForLoopEven
{
    public static void main(String[] args)
    {
        for(int i = 2; i % 2 == 0 &&  i <= 20; i++)  //for(int i = 2; i <= 20; i += 2) this is professionalay way 
        {                                            //{  System.out.println(i);   }
            System.out.println(i++);                 //
        
        }
    }
}