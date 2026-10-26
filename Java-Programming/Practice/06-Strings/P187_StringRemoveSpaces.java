public class P187_StringRemoveSpaces
{
    public static void main(String[] args)
    {
        String name = "Java Programming";
        String name2 ="";

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);

            if(ch != ' ')
            {
                name2 = name2 + ch;
            }
        }
        System.out.println(name2);
    }
}