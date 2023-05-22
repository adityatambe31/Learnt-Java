// program to calculate the value assigned to it and perform
// various operation.......
// in this we require class for the call the function..
// also we are not able to call it without the class an for that 
// require to decode it in some other code....
public class Calculator {
    public static void main(String args[])
    {
        int a = 10;
        int b = 30;

        int c = add(a,b);
        System.out.println("The sum of two numbers is: "+c);
    
        int s = sub(a,b);
        System.out.println("The subtraction of two numbers is: "+s);

        int d = div(a,b);
        System.out.println("The division of two numbers is: "+d);
        
        int m = mul(a,b);
        System.out.println("The multiplication of two numbers is: "+m);
    }

    public static int add(int n1, int n2)
    {
        int p;
        p = n1+n2;
        return p;
    }

    public static int mul(int n1, int n2)
    {
        int m;
        m = n1*n2;
        return m;
    }
    public static int sub(int n1, int n2)
    {
        int s;
        s = n1-n2;
        return s;
    }
    public static int div(int n1, int n2)
    {
        int d;
        d = n1/n2;
        return d;
    }
}
