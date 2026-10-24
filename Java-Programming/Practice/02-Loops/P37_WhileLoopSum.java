public class P37_WhileLoopSum
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 0;

        while(i<=5)
        {
           sum = sum + i; 
           System.out.println(i);
           i++;     
        }
        System.out.println("sum: " + sum);

    }
}