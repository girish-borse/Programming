public class P197_StringRemoveSpecificCharacter
{
    public static void main(String[] args)
    {
        String name ="Development";
        char remove ='e';
        String result = "";

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            
            if(ch != remove)
            {
                result = result + ch;
            }
        }
         System.out.println(result);
    }
}