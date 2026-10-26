public class P195_StringFirstRepeatingCharacter
{
    public static void main(String[] args)
    {
        String name = "Programming";

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            int count = 0;

            for(int j=0; j<name.length(); j++)
            {
                if(ch == name.charAt(j))
                {
                    count++;
                }
            }
            if(count > 1)
            {
                System.out.println(ch);
                break;
            }
        }
    }
}