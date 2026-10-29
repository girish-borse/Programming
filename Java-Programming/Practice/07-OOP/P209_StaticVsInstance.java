class Student
{
  void study()                                        // Instance method
  {
    System.out.println("Student is studying");
  }

  static void showCollage()                          // Static method
  {
    System.out.println("ABC collage");
  }
}
public class P209_StaticVsInstance
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.study();                              

        Student.showCollage();
    }
}