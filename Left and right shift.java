import java.util.Scanner;

class shivt
{
    public static void main(String[] args) 
    {
        for(int clear = 0; clear < 1000; clear++)
         System.out.println("\b") ;
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
         a=sc.nextInt();
         b=a<<3;
         c=a>>3;
        System.out.println("Values are "+b+" "+c);
       
    }
}