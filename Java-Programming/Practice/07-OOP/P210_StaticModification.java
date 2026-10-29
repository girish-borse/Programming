class Student
{
  static String collage = "ABC collage";
}
public class P210_StaticModification
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.collage);
        System.out.println(s2.collage);
        
        s1.collage = "XYZ collage";

        System.out.println(s1.collage);
        System.out.println(s2.collage);
    }
}