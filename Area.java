abstract class Shape
{
    abstract void area();
    double area;
}
class triangle extends Shape
{
    double b=60,h=20;
    void area()
    {
        area=(b*h)/2;
        System.out.println("area of triangle ="+area);
    }
}
class Rectangle extends Shape
{
    double w=80,h=10;
    void area()
    {
        area = w*h;
        System.out.println("Area of Rectangle ="+area);
    }
}
class Area
{
    public static void main(String[] args)
    {
    triangle t=new triangle();
    Rectangle r=new Rectangle();
    t.area();
    r.area();  
    }
}