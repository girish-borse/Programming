class Animal
{
    void sound()
    {
        System.out.println("Animal mak a sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class P228_MethodOverriding
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();

        d1.sound();
    }
}