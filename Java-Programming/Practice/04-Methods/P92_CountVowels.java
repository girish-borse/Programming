import java.util.Scanner;

public class P92_CountVowels
{
    static int countVowels(String text)
    {
        int count = 0;

        for(int i=0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
              count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter text:");

     String text = sc.nextLine();

     int result = countVowels(text);
     System.out.println("Number of vowels:"+ result);

    }
}