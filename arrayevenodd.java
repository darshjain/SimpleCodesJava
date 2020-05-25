import java.util.Scanner;
class eve
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        int a[]=new int[1000];
        System.out.println("Enter Number of elements: ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("The even numbers are: ");
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            System.out.print(a[i]+" ");
        }
        System.out.println("\nThe odd numbers are: ");
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            System.out.print(a[i]+" ");
        }
    }
}