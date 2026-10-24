import java.util.Scanner;

public class P91_CheckPasswordLength
{
    static boolean isValidPassword(String password)
    {
       if(password.length() >= 8)
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
      System.out.println("Enter the password:");
      String password = sc.nextLine();

      boolean result = isValidPassword(password);
      System.out.println("Valid Passwod:" + result);
    }
}