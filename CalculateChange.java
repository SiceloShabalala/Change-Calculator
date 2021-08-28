/**
 * @author: Sicelokuhle Shabalala
 * @date: 28/08/2021
 * @title: Change Calculator
 */
import java.util.*;
public class CalculateChange
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter change amount:");
        int amount = sc.nextInt();
        change(amount);
        sc.close();
    }

    /**
     * @param money is the amount to be converted into a change of R5 
     */
    public static void change(int money)
    {
        int numOfR5 = money/5;
        int numOfR2 = (money - 5*numOfR5)/2;
        int numOfR1 = money - (5*numOfR5 + 2*numOfR2);

        System.out.println("The change:");
        System.out.println(numOfR5+" R5 coins");
        System.out.println(numOfR2+" R2 coins");
        System.out.println(numOfR1+" R1 coins");
    }
}