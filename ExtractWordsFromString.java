import java.util.Scanner;
class Extractwords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String text;
        int c=1,i;
        System.out.println("Enter");
        text=sc.nextLine();
        System.out.println("Your String is: "+text);
        for(i=0;i<text.length()-1;i++)
        {
            if(text.charAt(i)==' '&&text.charAt(i+1)!=' ')
            c++;
        }
        String[] words=text.split(" ",c);
        System.out.println("This is new  ");
        for(String word:words)
        System.out.println(word);
    }
}