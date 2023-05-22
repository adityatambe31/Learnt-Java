public class nested_if_else {
    public static void main(String args[])
    {
        int age = 12;
        if(age > 0)
        {
            if(age > 18)
            {
                System.out.println("You can vote.");
            }
            else
            {
                System.out.println("You cannot vote.");
            }
        }
        else
        {
            System.out.println("Age must be greater than 0");
        }        
    }

}
