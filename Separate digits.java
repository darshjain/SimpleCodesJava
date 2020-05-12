import java.util.Scanner;

class digits
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Values");
        int n=sc.nextInt();int i=1;
        while(n!=0)
        {
            System.out.println(i+ " Digit  "+(n%10));
            n=n/10;
            i++;
        }


    }
}