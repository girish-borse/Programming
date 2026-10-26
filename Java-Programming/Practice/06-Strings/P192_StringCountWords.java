public class P192_StringCountWords
{
    public static void main(String[] args)
    {
        String name = "Java is Powerful";
        int countWords = 0;


        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == ' ')
            {
               countWords++;
            }
           
        }
        countWords = countWords + 1;
        System.out.println("Count: " + countWords);

    }
}