class Engine
{
    void start()
    {
        System.out.println("Engine starts");
    }
}

class Car
{
    Engine engine = new Engine();

    void drive()
    {
      engine.start();
      System.out.println("Car is driving");
    }   
}

public class P238_Composition
{
    public static void main(String[] args)
    {
        Car car = new Car();
        
        car.drive();
    }
}