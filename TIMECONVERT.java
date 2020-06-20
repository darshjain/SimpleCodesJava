import java.util.Scanner;
class Timeconvert
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in seconds :");
        int seconds=sc.nextInt();
    
        int minutes=seconds/60;
        seconds=seconds%60;    
        int hours=minutes/60;
        minutes=minutes%60;   
        int days=hours/24;
        hours=hours%24;

        System.out.println(days+" days "+hours+" hours "+minutes+" minutes "+seconds+" seconds ");
    }
}