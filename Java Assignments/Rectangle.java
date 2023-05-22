// Program to determine the area and perimeter of the designated shape....
class Shape 
{
    int length;
    int breadth;

    void insert(int l, int b)
    {
        length = l;
        
        if(l<0)
        {
            length = 1;
        }
        else
        {
            length = l;
        }
        breadth = b;

        if(b<0)
        {
            breadth = b;
        }
        else
        {
            breadth = b;
        }
    }


    void display()
    {
        System.out.println("The area of the rectangle is: "+length*breadth);
        System.out.println("The area of the rectangle is: "+2*(length+breadth));
    }

    int getLength()
    {
        return length; 
    }
    
    int getBreadth()
    {
        return breadth;
    }
    
}

class Rectangle 
{
    public static void main(String args[])
    {
        Shape s1 = new Shape();
        s1.insert(2,5);
        s1.display();
    }
}
