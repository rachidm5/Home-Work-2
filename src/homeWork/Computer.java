package homeWork;

import java.util.Scanner;

public class Computer {

	static String brandNam;
	static double unitPrice;
	static int quantity;
	static double totalPay;

	public static void welcome() {
		System.out.println(" .......Welcome to Best buy .....\n");
	}

	public static void getInput() {
		// input :
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter brand Name ");
		brandNam = sc1.nextLine();
		System.out.println("Enter Unit Price ");
		unitPrice = sc1.nextDouble();
		System.out.println("Enter Quantity ");
		quantity = sc1.nextInt();
	}

	public static void Usecalculate() {
		// calculate :

		double discount;

		totalPay = unitPrice * quantity;

	}

	public static void displayOutPut() {
		// out put :
		System.out.printf("this is %s \n", brandNam);
		System.out.printf("it cost $ %10.2f \n", unitPrice);
		System.out.printf(" the quantity is %d \n", quantity);
		System.out.printf("This TOTAL Pay $%f \n", totalPay);
		
		int discount; 
		if(totalPay >= 1000) {
		 System.out.println("this total pay after dicount"+(totalPay -20) );
         System.out.println("discount : 20 " ); 
			
		
		}
	
	}

	public static void exit() {
		System.out.println();
		System.out.println(".......Thanks for Coming, See you next time.......");

	}

	public static void main(String[] args) {

		Computer.welcome();

		char doYouWantToContinue;
		do {
			Computer.getInput();
			Computer.Usecalculate();
			Computer.displayOutPut();
			System.out.println("would you like continue tape Y for yes or N for no");
			Scanner sc2 = new Scanner(System.in);
			doYouWantToContinue = sc2.next().charAt(0);

		} while (doYouWantToContinue == 'y' || doYouWantToContinue == 'Y');

		Computer.exit();

	}

}
