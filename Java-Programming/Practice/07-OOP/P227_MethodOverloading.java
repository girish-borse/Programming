class Calculator
{
    int add(int a, int b)
    {
       return a + b;
    }
    int add(int a, int b , int c)
    {
      return a + b + c;
    }
}

public class P227_MethodOverloading
{
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();

        System.out.println(c1.add(10, 20));
        System.out.println(c1.add(10, 20, 30));
    }
}