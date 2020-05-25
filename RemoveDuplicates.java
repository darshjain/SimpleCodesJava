import java.util.Scanner;
class duplicate
{
    public static void main(String[] args)
    {
        int i,j,nj=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n=sc.nextInt();
        int num[]=new int[n];
        int num2[]=new int[n];
        for(i=0;i<n;i++)
          num[i]=sc.nextInt();
        System.out.println("Before :");
        for(i=0;i<n;i++)
          System.out.print(num[i]+" ");
        System.out.println("\nAfter : ");
        for(i=0;i<n;i++)
        {
            int flag=0;
            for(j=0;j<nj;j++)
            {
                if(num[i]==num2[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                num2[nj]=num[i];
                nj++;
            }
        }
        for(j=0;j<nj;j++)
        System.out.print(num2[j]+" ");
    }
}