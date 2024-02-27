class classA{
    public static void show(){
        System.out.println("This is classA");
    }
}
interface InterfaceB{
    public void display1();
}
interface InterfaceC{
    public void display2();
}
class classD extends classA implements InterfaceB,InterfaceC
{
    public void display1()
    {
        System.out.println("This is inerface B");
    }
    public void display2()
    {
        System.out.println("This is interface C");
    }
    public void display3()
    {
        System.out.println("This is interface D");
    }
}
public class hybrid {
    public static void main(String[] args) {
        classD obj=new classD();
        obj.show();
        obj.display1();
        obj.display2();
        obj.display3();
    }
    
}
