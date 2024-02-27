abstract class vehicle
{
    public abstract void numwheels();
}
class Car extends vehicle
{
    public void numwheels()
    {
        System.out.println("Car has four wheels.");
    }
}
class Truck extends vehicle
{
    public void numwheels()
    {
        System.out.println("Truck has six wheels.");
    }
}
public class Demo
{
    public static void main(String args[])
    {
        Car c=new Car();
        c.numwheels();
        Truck t=new Truck();
        t.numwheels();
    }
}