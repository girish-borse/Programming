public class P93_MethodCallingMethod
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static int calculate()
    {
        int result = add(10,20);
        return result;
    }
    public static void main(String[] args)
    {
       int result = calculate();
       System.out.println("Sum = " + result);
    }
}