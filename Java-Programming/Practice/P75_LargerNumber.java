public class P75_LargerNumber
{
    static int larger(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args)
    {
         int result = larger(25,40);
         System.out.println(result);
    }
}