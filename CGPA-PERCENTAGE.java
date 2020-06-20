import java.util.Scanner;
class convert 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The Choices are:\n1:CGPA to percentage\n2:Percentage to CGPA");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter Your CGPA : ");
            double cgpa=sc.nextDouble();
            double percent=7.1*cgpa+11;
            System.out.println("The Percentage is: "+percent+"%");
        }
        else if(choice==2)
        {
            System.out.println("Enter Your Percentage : ");
            double percent=sc.nextDouble();
            double cgpa=(percent-11)/7.1;
            System.out.println("The CGPA is: "+cgpa);   
        }
        else
        System.out.println("ERROR");
    }
}