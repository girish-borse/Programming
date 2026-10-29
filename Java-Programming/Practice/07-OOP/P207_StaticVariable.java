class Student
{
    String name;
    static String collage = "ABC Collage";
}

public class P207_StaticVariable
{
    public static void main(String[] args)
    {
       Student s1 = new Student();
       Student s2 = new Student();

       s1.name = "Girish";
       s2.name = "Rahul";

       System.out.println(s1.name);
       System.out.println(s1.collage);

       System.out.println(s2.name);
       System.out.println(s2.collage);

    }

}