// as in I was discussing for function to call without class we require object for every function we want to call..
// we have declared mul function and multiplication object m1 to execute the further code .......... 

// the similar code we created and executed earlier, so in this case w had to create object with the function we want........

class Multiplication {
    
    public static void main(String args[])
    {
        int a = 30;
        int b = 10;

        Multiplication m1 = new Multiplication();
        Multiplication m2 = new Multiplication();
        Multiplication m3 = new Multiplication();
        Multiplication m4 = new Multiplication();

        int result1 = m1.mul(a,b);
        int result2 = m2.sub(a,b);
        int result3 = m3.add(a,b);
        int result4 = m4.div(a,b);

        System.out.println("Result of multiplication = "+result1);
        System.out.println("Result of subtraction = "+result2);
        System.out.println("Result of addition = "+result3);
        System.out.println("Result of division = "+result4);
    }

    int mul(int n1, int n2)
    {
        return n1*n2;
    }
    int sub(int n1, int n2)
    {
        return n1-n2;
    }
    int add(int n1, int n2)
    {
        return n1+n2;
    }
    int div(int n1, int n2)
    {
        return n1/n2;
    }

}
