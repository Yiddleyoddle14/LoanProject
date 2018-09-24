package chap3examples;
import java.util.Scanner; 
/*
 * Ailsa Mensinger
 * 9-24-28
 */

public class Loan_Project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double loan_amount;
		double interest_rate;
		double years;
		
		
		System.out.println("Enter your loan amount");
		loan_amount = input.nextDouble();  
		System.out.println("Enter your interest rate");
		 interest_rate = input.nextDouble();
		System.out.println("Enter the amount of years to pay off the loan");
		years = input.nextDouble();
		interest_rate = interest_rate/1200; 
		double monthly_payment = loan_amount*interest_rate/(1-1/Math.pow(1+ interest_rate, years*12)); 
		double total = (monthly_payment*12*years); 
		System.out.println("Monthly payment: $" + monthly_payment);
		System.out.println("Total payment: $" + total);
		
		
		
		
		
		
		
		
		
		

	}

}
