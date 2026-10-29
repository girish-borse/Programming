 class Student
{
  String name;
  int age;  

  Student()
  {
    System.out.println("Student object created");
  }
}

public class P201_ClassObject
{
    public static void main(String[] args)
    {
       Student s1 = new Student();
       Student s2 = new Student();
    }
}