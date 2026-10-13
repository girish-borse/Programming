public class P87_CheckEvenOdd
{
    static String checkEvenOdd(int n)
    {
        if(n % 2 == 0)
        {
            return "even";
        }
        else
        {
            return "Odd";
        }
    }
    public static void main(String[] args)
    {
      String result = checkEvenOdd(9);
      System.out.println(result);
    }
}