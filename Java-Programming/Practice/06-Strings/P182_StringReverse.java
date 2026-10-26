public class P182_StringReverse
{
    public static void main(String[] args)
    {
        String name = "Girish";
        String result = "";

        for(int i=name.length()-1; i>=0; i--)
        {
          char ch = name.charAt(i);
          result = result + ch;
        }
        System.out.println(result);
    }
}