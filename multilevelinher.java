class classA
{
    public static void display() {
        System.out.println("This is classA");
    }
}
class classB extends classA
{
    public static void display1() {
        System.out.println("This is classB");
    }
}
class classC extends classB
{
    public static void display2() {
        System.out.println("This is classC");
    }
}

public class multilevelinher {
    public static void main(String[] args) {
        classC obj=new classC();
        obj.display();
        obj.display1();
        obj.display2();
    }
    
}
