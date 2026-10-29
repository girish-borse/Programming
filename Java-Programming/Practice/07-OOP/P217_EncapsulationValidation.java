class Student
{
   private int age;

   public void setAge(int age)
   {
       if(age >= 0)
       {
          this.age = age;
       }
   }

   public int getAge()
   {
       return age;
   }
}
public class P217_EncapsulationValidation
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.setAge(24);
        System.out.println(s1.getAge());

        s1.setAge(-5);
        System.out.println(s1.getAge());
    }
}