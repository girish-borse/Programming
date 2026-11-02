class Animal
{
    Animal()
    {
      System.out.println("Animal Constructor");
    }
}

class Dog extends Animal
{
    Dog()
    {
        super();

        System.out.println("Dog constructor");
    }
}

public class P233_SuperConstructor
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
    }
}