class Animal
{
    String name = "Animal";
}

class Dog extends Animal
{
    String name = "Dog";

    void showNames()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class P231_SuperVariable
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();

        d1.showNames();
    }
   
}