class Student
{
   void study()
   {
    System.out.println("Student is studying");
   }

   void startStudy()
   {
     this.study();
   }
   
}

public class P204_ThisMethod
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.startStudy();
    }
}