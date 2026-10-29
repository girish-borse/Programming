class Student
{
    String name;

    Student(String name)
    {
        this.name = name;
    }
}
    public class P203_ThisKeyword
    {
        public static void main(String[] args)
        {
            Student s1 =new Student("Girish");

            System.out.println(s1.name);
        }
    }
