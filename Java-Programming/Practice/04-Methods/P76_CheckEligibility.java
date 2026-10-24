public class P76_CheckEligibility
{
    static boolean isEligible(int age)
    {
      if(age >= 18)
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
       boolean result = isEligible(17);
       System.out.println(result);
    }
}