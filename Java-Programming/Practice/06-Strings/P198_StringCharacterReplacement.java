public class P198_StringCharacterReplacement
{
  public static void main(String[] args)
  {
    String name ="Development";
    char oldChar = 'e';
    char newChar = 'E';
    String result = "";

    for(int i=0; i<name.length(); i++)
    {
        char ch = name.charAt(i);

        if(ch == oldChar)
        {
            result = result + newChar;
        }
        else
        {
            result = result + ch;
        }
    }
     System.out.println(result);
  }
}