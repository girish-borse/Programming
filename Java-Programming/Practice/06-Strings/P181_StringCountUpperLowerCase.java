public class P181_StringCountUpperLowerCase
{
    public static void main(String[] args)
    {
        String name = "GiRiSh";

        int countUpperCase = 0;
        int countLowerCase = 0;

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            
            if(Character.isUpperCase(ch))
            {
               countUpperCase++;
            }
            if(Character.isLowerCase(ch))
            {
                 countLowerCase++;
            }
        }
        System.out.println("UpperCase: " + countUpperCase);
        System.out.println("LowerCase: " + countLowerCase);
    }
}