// Left Shift Operator = num * (2 ^ 1)...... 
// Right Shift Operator = num / (2 ^ 1)...... 


public class Shift_Operator {
    public static void main (String args[])
    {
        System.out.println(10<<2);   // 10 * (2 ^ 2) = 10 * 4 = 40
        System.out.println(10<<3);   // 10 * (2 ^ 3) = 10 * 8 = 80
        System.out.println(20<<3);   // 20 * (2 ^ 3) = 20 * 8 = 160


        System.out.println(20>>2);   // 10 / (2 ^ 2) = 20 / 4 = 5 
    }
}
