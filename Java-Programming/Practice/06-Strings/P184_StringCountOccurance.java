public class P184_StringCountOccurance
{
    public static void main(String[] args)
    {
        String name ="Programming";
        int count = 0;

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == 'g')
            {
             count++;
            }
        }
        System.out.println(count);
    }
}