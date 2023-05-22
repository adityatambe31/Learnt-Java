class Shape
{
    
    float radius1;

    void insert(float i)
    {
        radius1 = i;
    }

    void display()
    {
        System.out.println("Area of the Circle is: "+ 3.14*radius1*radius1);
    }
}

class Circle 
{
    public static void main(String args[])
    {
    
    Shape s1 = new Shape();    
    Shape s2 = new Shape();    
    Shape s3 = new Shape();

    s1.insert(3);
    s2.insert(4);
    s3.insert(5);


    s1.display();
    s2.display();
    s3.display();

    }
}