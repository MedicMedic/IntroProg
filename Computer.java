package computer;
import java.util.Scanner;
public class Computer 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String product_name = "none";
		char product;
		double product_price = 0;
		int payment_mode;
		String payment = null;
		double final_price = 0;
		double discountorinterest = 0;
		double monthly_amor = 0;
		
		System.out.print("Press I/i:Iphone 13\t\t$75,000.00\n" +
				"Press S/s:Samsung Note 20\t$76,000.00\n" +
				"Press X/x:Xiaomi Black shark\t$35,000.00\n");
		System.out.print("Enter item: \t");
		product = input.next().charAt(0);
		
		switch(product) 
		{
		case 'I', 'i' : product_name = "iPhone 13";
					product_price = 75000.00;
					break;
					
		case 'S', 's' : product_name = "Samsung Note 20";
					product_price = 76000.00;
					break;
		
		case 'X', 'x' : product_name = "Xiaomi Black Shark";
					product_price = 35000.00;
					break;
		}	
		System.out.print("Your item is " + product_name + "\n");
		System.out.print("Price:\t\t$"+product_price);
		
		System.out.print("\n\nSelect mode of payment\n");
		System.out.print("Press 1: Cash\t\t       10% Discount\n" + 
				"Press 2: 3 Months Installment   5% Interest\n" +
				"Press 3: 6 Months Installment  10% Interest\n" +
				"Press 4: 12 Months Installment 20% Interest\n");
		System.out.print("\nEnter Mode of Payment: ");
		payment_mode = input.nextInt();
		
		switch(payment_mode)
		{
			case 1: payment = "Cash";
						discountorinterest = product_price * 0.1;
						final_price = product_price - discountorinterest;
						monthly_amor = 0;
						break;
						
			case 2: payment = "3-Month Installment";
						discountorinterest = product_price * 0.05;
						final_price = product_price + discountorinterest;
						monthly_amor = final_price / 3;
						break;
						
			case 3: payment = "6-Month Installment";
						discountorinterest = product_price * 0.1;
						final_price = product_price + discountorinterest;
						monthly_amor = final_price / 6;
						break;
						
			case 4: payment = "12-Month Installment";
						discountorinterest = product_price * 0.2;
						final_price = product_price + discountorinterest;
						monthly_amor = final_price / 12;
						break;	
					
			default: break;
		}
		System.out.print("Mode of Payment: \t" + payment);
		System.out.print("\nItem: \t\t\t" + product_name);
		System.out.print("\nPrice: \t\t\t$" + product_price);
		System.out.print("\nDiscount/Interest: \t$" + discountorinterest);
		System.out.print("\nTotal Amount: \t\t$" + final_price);
		System.out.print("\nMonthly Amortization: \t$" + monthly_amor);
	}
}
