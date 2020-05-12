import java.util.Scanner;

class great
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b&&c<b)
        System.out.println("B");
        else if(a>b&&a>c)
        System.out.println("A");
        else
        System.out.println("c");
       
    }
}