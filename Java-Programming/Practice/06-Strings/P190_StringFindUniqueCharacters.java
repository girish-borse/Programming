public class P190_StringFindUniqueCharacters
{
    public static void main(String[] args)
    {
        String name = "Programming";
        String result = "";

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(name.indexOf(ch) == name.lastIndexOf(ch))
            {
               result = result + ch;
            }
        }
        System.out.println(result);
    }
}