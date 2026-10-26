public class P189_StringFindDuplicateCharacters
{
    public static void main(String[] args)
    {
        String name = "Programming";
        String result = "";

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
        
            if(name.indexOf(ch)!= name.lastIndexOf(ch)&& result.indexOf(ch)==-1)
            {
              result = result + ch;
            }
        }
        System.out.println(result);
    }
}