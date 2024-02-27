 class classA
{
    static void display()
    {
        System.out.println("This is class A");
    }
}
class classB extends classA
{
    static void display1()
    {
        System.out.println("This is class B");
    }
}
class single
{
    public static void main(String args[])
    {
        classB obj=new classB();
        obj.display();
        obj.display1();
    }
}