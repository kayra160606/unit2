class one{
    static void display()
    {
        System.out.println("This is one");
    }
}
class two extends one{
    static void display1()
    {
        System.out.println("This is two");
    }
}
class three extends one{
    static void display2()
    {
        System.out.println("this is three");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        two obj1=new two();
        three obj2=new three();
        obj1.display();
        obj1.display1();
        obj2.display();
        obj2.display2();
    }
}
