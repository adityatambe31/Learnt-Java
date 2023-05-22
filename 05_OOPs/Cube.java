class Shape
{
    int side;

void insert(int s)
{
    side = s;
}

void display()
{
    System.out.println("Area of cube is: "+ side*side);
    System.out.println("Volume of cube is: "+ side*side*side);
}
}
public class Cube 
{
    public static void main(String args[])
    {
        Shape s1 = new Shape();
        Shape s2 = new Shape();
        Shape s3 = new Shape();

        s1.insert(2);
        s2.insert(3);
        s3.insert(4);
        
        s1.display();
        s2.display();
        s3.display();
    }
}
