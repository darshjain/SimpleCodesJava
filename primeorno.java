import java.util.Scanner;
class prime
{
    int a,i,flag=0;
    void getdata(int x)
    {
        a=x;
    }
    int primeorno()
    {
        for(i=2;i<a;i++)
        {
            if(a%i==0)
          {  
            flag=1;
            break;
          }
        }
        return flag;
    }
    
}
class primesolvessa
{
    public static void main (String[] args)
    {int flags=0;
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=s.nextInt();
        prime p1=new prime();//object created
        p1.getdata(n);//method
        flags=p1.primeorno();//function call
        if(flags==0)
        System.out.println("Yes");
        else
        System.out.println("No");


    }
}