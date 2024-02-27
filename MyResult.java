interface Exam
{
    boolean Pass(int mark);
}
interface classify
{
    String division(int avg);
}
class result implements Exam,classify
{
    public boolean Pass(int mark)
    {
        if(mark>=50)
            return true;
        else
            return false;
    }
    public String division(int avg)
    {
        if(avg>=60)
            return "First";
        else if(avg>=50)
            return "Second";
        else
            return "no-division";
    }
}
 class MyResult
{
    public static void main(String[] args)
    {
        boolean pass;
        int mark,avg;
        String division;
        DataInputStream in=new DataInputStream(System.in);
        result res=new result();
        try
        {
            System.out.println("Enter the mark:");
            mark=Integer.parseInt(in.readLine());
            System.out.println("Enter the average:");
            avg=Integer.parseInt(in.readLine());
            pass=res.Pass(mark);
            division=res.division(avg);
            if(pass)
                System.out.println("Passed-"+division+".");
            else
                System.out.println("Failed-"+division+".");
        }
        catch(Exception e)
        {
            System.out.println("Error :"+e);
        }
    }
}