class Student 
{
    static
    {
      System.out.println("Static block executed");    //Static block executes when that class is initialized/loaded for use, before its first use.
    }
}
public class P211_StaticBlock
{
    public static void main(String[] args)
    {
        System.out.println("Main method executed");             
    }
}