public class if_else_ladder 
{
    public static void main(String args[])
    {
        int marks = 60;

        if (marks >= 60)
        {
            System.out.println("you are passed!!");
        } 
        else if(marks >=70)
        {
            System.out.println("You are passed with descent score!");
        } 
        else if(marks >=80)
        {
            System.out.println("You are passed with good score!");
        } 
        else if(marks >=90)
        {
            System.out.println("You are passed with great score!");
        }
    }
}