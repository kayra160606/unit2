interface numbers 
{
    public int process(int x,int y);
}
    class Sum implements numbers
    {
        public int process(int x,int y)
        {
            return(x+y);
        }
    }
    class average implements numbers
    {
        public int process(int x, int y)
        {
            return((x+y)/2);
        }
    }
    class interfacedemo
    {
        public static void main(String args[])
        {
             int a,b;
            Sum add=new Sum();
            a=add.process(10,20);
            System.out.println("Your Sum is:"+a);
            average avg=new average();
            b=avg.process(40,80);
            System.out.println("Your average is:"+b);
        }
    }
    

