public class P96_MethodOverloading
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
      int result = add(10,20);
      System.out.println("Sum of 2 numbers: " + result);

     int result2 = add(10,20,30);
     System.out.println("Sum of 3 numbers: " + result2);
    }
}