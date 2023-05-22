class Shape {
    int length;
    int breadth;


void insert(int l, int b)
{
    length = l;
    breadth = b;
}

void display()
{
    System.out.println("Area of the Rectangle is : "+length*breadth);
    
}
}

class Rectangle
{
    public static void main(String args[])
    {
        Shape s1 = new Shape();
        Shape s2 = new Shape();
        s1.insert(10,20);
        s2.insert(20,30);
        
        s1.display();
        s2.display();

    }
}
