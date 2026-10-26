public class P180_StringCountSpaces
{
    public static void main(String[] args)
    {
        String name = "Girish  ";

        int countSpace = 0;

        for(int i =0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == ' ')
            {
               countSpace++;
            }
        }
        System.out.println(countSpace);
    }
}