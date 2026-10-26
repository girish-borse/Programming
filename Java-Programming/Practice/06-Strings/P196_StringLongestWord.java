public class P196_StringLongestWord
{
    public static void main(String[] args)
    {
        String name = "Java is powerfull language";
        String[] words = name.split(" ");

        String longestWord = "";
       
        for(int i=0; i<words.length; i++)
        {
           String currentWord = words[i];

           if(currentWord.length() > longestWord.length())
           {
              longestWord = currentWord;
           }
        }
        System.out.println(longestWord);

    }
}