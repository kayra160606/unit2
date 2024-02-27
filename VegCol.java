abstract class Vegetable 
{
    public String color;
}
class Potato extends Vegetable
{
    public String toString()
    {
        color="Brown -skinned Color";
        return "potato -->"+color;
    }
}
class Brinjal extends Vegetable
{
    public String toString()
    {
        color="purple color";
        return "Brinjal -->"+this.color;
    }
}
class Tomato extends Vegetable
{
    public String toString()
    {
        color="red color";
        return "Tomato -->"+color;
    }
}
class VegCol
{
    public static void main(String[] args)
    {
        Potato p=new Potato();
        Brinjal b=new Brinjal();
        Tomato t=new Tomato();
        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
}