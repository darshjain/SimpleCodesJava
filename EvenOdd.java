import java.util.Scanner;
class evenodd
{
    int a,flag;
    void getdata(int x)
    {
        a=x;
    }
    int check()
    {
        if(a%2==0)
        flag=1;
        else
        flag=0;
        return flag;
    }
}
class evenoddcheck
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n,flags;
        n=sc.nextInt();
        evenodd obj1=new evenodd();
        obj1.getdata(n);
        flags=obj1.check();
        if(flags==0)
        System.out.println("Odd");
        else
        System.out.println("Even");
        sc.close();

    }
}