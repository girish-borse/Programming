import java.util.Scanner;

public class P89_CountCharactersWithInput
{
    static int countCharacters(String name)
    {
      return name.length();
    } 
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name:");
      String name = sc.nextLine();

      int result = countCharacters(name);
      System.out.println("the number of characters is: " + result);
   }
}