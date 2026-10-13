public class P95_AddTwoNumbers
{
    static double calculate(int price, double discount)
    {
      double discountAmount = price * discount / 100;
      return price - discountAmount; 
    }
    public static void main(String[]  args)
    {
      double result = calculate(1000,10);
      System.out.println(result);
    }
}