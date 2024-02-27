 class company1
{
    public static void main(String args[])
    {
        String name[]={"LG","SAMSUNG","SONY","MI"};
        int i, price[]={1000,2000,1500,500};
        int low=price[0];
        int l=name.length;
        int n=price.length;
        for(i=0;i<n;i++)
        {
            if(low>price[i])
            low=price[i];
        }
        for(i=0;i<n;i++)
        {
            if(low == price[i])
            System.out.println("Lowest company is ="+name[i]);
        }
    }
}