class Student
{
  private String name;
  private int age;
}
public class P215_EncapsulationBasics
{
    public static void main(String[] args)
    {
       Student s1 = new Student();

       // Error occurs because name and age are private.
       // Private data cannot be accessed directly from outside the Student class.
       s1.name ="Girish";
       s1.age = 24;
    }
   
}