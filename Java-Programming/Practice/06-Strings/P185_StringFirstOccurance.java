public class P185_StringFirstOccurance
{
    public static void main(String[] args)
    {
        String name = "Programming";
        int index = 0;

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == 'g')
            {
               index = i;
               break;

            }
        }
        System.out.println(index);
    }
}