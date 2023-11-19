package Tuition;
import java.util.Scanner;
public class Tuition2
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String name;
        int units_enrolled;
        double unit_price;
        double tuition_fee = 0;
        
        System.out.println("Enter name: ");
        name = input.nextLine();
        
        System.out.println("Enter number of units enrolled: ");
        units_enrolled = input.nextInt();
        
        System.out.println("Enter price per unit: ");
        unit_price = input.nextInt();
        
        tuition_fee = units_enrolled * unit_price;
        
        System.out.println();
        System.out.printf("Computed tuition fee:  %,.2f dollars%n" + tuition_fee);
        System.out.println(name + ", you could avail the following payment mode:");
        
        double cash_payment = tuition_fee * 0.90;
        double installment2 = tuition_fee * 1.05;
        double installment3 = tuition_fee * 1.10;
        
        System.out.printf("Cash Payment: %,.2f dollars%n" + cash_payment);
        System.out.printf("2-installment: %,.2f dollars%n" + installment2);
        System.out.printf("3-installment: %,.2f dollars%n" + installment3);
    }
}

