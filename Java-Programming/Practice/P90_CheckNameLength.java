import java.util.Scanner;

public class P90_CheckNameLength
{
    static boolean isLongname(String name)
    {
       if(name.length() > 5)
        {
            return true;
        }
        else
        {
            return false; 
        }
    }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name:");
      
      String name = sc.nextLine();

      boolean result = isLongname(name);
      System.out.println("Long name:" + result);
     }  
}