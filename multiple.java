interface a{
    public void display();
}
interface b{
    public void display1();
}
interface c extends a,b{
    public void display2();
}
class D implements c{
    public void display(){
        System.out.println("This is one");
    }
    public void display1(){
        System.out.println("This is two");
    }
    public void display2(){
        System.out.println("This is three");
    }
    public void display3(){
        System.out.println("This is four");
    }
}

public class multiple {
    public static void main(String[] args) {
        System.out.println("hello from main class");
        D f=new D();
        f.display();
        f.display1();
        f.display2();
        f.display3();
    }
    
}
