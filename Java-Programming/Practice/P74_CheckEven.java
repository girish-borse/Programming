public class P74_CheckEven
{
    static boolean isEven(int n)
    {
      return (n % 2 == 0);

    }
    public static void main(String[] args)
    {
       boolean result = isEven(10);
       System.out.println(result);
    }
}