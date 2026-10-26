public class P191_StringCharacterFrequency
{
    public static void main(String[] args)
    {
        String name = "Programming";
        String result = "";
       

      for(int i=0; i<name.length(); i++)
        {
          int count = 0;
          char ch = name.charAt(i);

            if(result.indexOf(ch) == -1)
            {
               for(int j=0; j<name.length(); j++)
               {
             
                   if(ch == name.charAt(j))
                   {
                     count++;
                   }
              
               }
               System.out.println(ch + "=" + count);
               result = result + ch;
            }
             
            
        }
        
    }
}