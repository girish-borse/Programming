public class P98_BillingCalculation
{
    static double calculate(int quantity , double price)
    {
        return quantity * price;
    }
    static double calculate(double price , int quantity)
    {
       return price * quantity;
    }

    public static void main(String[] args)
    {
      double result = calculate(5, 99.50);
      System.out.println("Total using quantity-price: " + result);

      double result2 = calculate(99.50, 5);
      System.out.println("Total using price-quantity: " + result2);
    }
}