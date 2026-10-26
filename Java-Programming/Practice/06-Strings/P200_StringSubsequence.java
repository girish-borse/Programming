public class P200_StringSubsequence
{
    public static void main(String[] args)
    {
        String name1 = "abcde";
        String name2 = "ace";

        int i=0;
        int j=0;

        while(i < name1.length() &&  j < name2.length())
        {
            if(name1.charAt(i) == name2.charAt(j))
            {
                j++;
            }

            i++;
        }
        if(j == name2.length())
        {
          System.out.println("Subsequence");
        }
        else
        {
            System.out.println("Not subsequence");
        }
    }
}