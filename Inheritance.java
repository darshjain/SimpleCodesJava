import java.util.Scanner;
class room           //superclass
{
    int l,b;
    room(int x,int y)
    {
        l=x;
        b=y;
    }
    int area()
    {
        return l*b;
    }
}
class bedroom extends room        //inheriting single from room //baseclass
{
    int h;
    bedroom(int x,int y,int z)
    {
        super(x,y);       //pass values to superclass
        h=z;
    }
    int volume()
    {
        return l*b*h;
    }
}
class money extends bedroom
{
    int rs;
    money(int x,int y, int z, int mon)
    {
        super(x,y,z);
        rs=mon;
    }
    int pay()
    {
        return l*b*h*rs;
    }

}
class inheritencetest
{
    public static void main(String[] args)
    {
        money room1=new money(14,12,10,10);
        int area1=room1.area();              //Super Class method
        int volume1=room1.volume();          //base class method
        int money1=room1.pay();              //level 2 bas class
        System.out.println("Area is: "+area1);
        System.out.println("Volume is: "+volume1);
        System.out.println("Money is: "+money1);
    }
}