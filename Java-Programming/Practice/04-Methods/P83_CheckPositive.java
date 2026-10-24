public class P83_CheckPositive
{
    static boolean checkPositive(int n)
    { 
      if(n > 0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    public static void main(String[] args)
    {
       boolean result = checkPositive(10);
       System.out.println(result);
    }
}