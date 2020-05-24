import java.util.Scanner;
class bubblesort
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n=sc.nextInt();
        int i,j;
        int num[]=new int[1000];
        System.out.println("Enter val: ");
        for(i=0;i<n;i++)
            num[i]=sc.nextInt();

        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(num[j]<num[i])
                {
                    int temp;
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }

            }
        }

        System.out.println("The sorted  Array is : ");
        for(i=0;i<n;i++)
            System.out.print(" "+num[i]+" ");

    }
}