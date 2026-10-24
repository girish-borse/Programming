public class P81_DisplaySum
{
    static int add(int a, int b)
    {
        return a+b;
    }

    static void displaySum(int a, int b)
    {
        int result = add(10, 20);
        System.out.println(result);
    }
    public static void main(String[] args)
    {
       displaySum(10, 20);
    }
}