import java.util.*;
class Rectangle
{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    void area()
    {
        System.out.println("The area of rectangle is"+l*b);
    }
    void perimeter()
    {
        System.out.println("The perimeter of rectangle is"+2*(l+b));
    }
}
class Square extends Rectangle
{
    Square(int l1,int b1)
    {
        super(l1,b1);
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        int l,b;
        Scanner in = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("enter the length,breadth:");
            l=in.nextInt();
            b=in.nextInt();
            Square s = new Square(l,b);
            s.area();
            s.perimeter();
        }
        
    }
}