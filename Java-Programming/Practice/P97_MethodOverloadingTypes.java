public class P97_MethodOverloadingTypes
{
    static int calculate(int a, int b)
    {
       return a+b;
    }
    static double calculate(double a, double b)
    {
       return a+b;
    }
    public static void main(String[] args)
    {
       int result = calculate(10, 20);
       System.out.println("Integer sum: " + result);

       double result2 = calculate(10.5,20.5);
       System.out.println("Double sum: " + result2);
    }
}