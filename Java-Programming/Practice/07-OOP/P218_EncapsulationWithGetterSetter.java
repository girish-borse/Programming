class Student
{
  private String name;
  private int age;
  
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }
  public int getAge()
  {
    return age;
  }
}
public class P218_EncapsulationWithGetterSetter
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.setName("Girish");
        s1.setAge(24);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}