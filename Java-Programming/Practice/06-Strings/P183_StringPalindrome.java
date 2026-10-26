public class P183_StringPalindrome
{
    public static void main(String[] args)
    {
        String name = "Hello";
        String reverse = "";

        for(int i=name.length()-1; i>=0; i--)
        {
            char ch = name.charAt(i);
            reverse = reverse + ch;
        }
           if(name.equals(reverse))
            {
              System.out.println("Palindrome");
            }
            else
            {
              System.out.println("Not Palindrome");
            }

    }
}