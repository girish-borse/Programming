class Student
{
   String name;

   Student(String name)
   {
    this.name = name;
   }
    void showName()
    {
     System.out.println(this.name);
    }
}

public class P205_ThisTwoObjects
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Girish");
        Student s2 = new Student("Rahul");

        s1.showName();
        s2.showName();
    }
}