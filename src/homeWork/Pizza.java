package homeWork;

import java.util.Scanner;

public class Pizza {

	public Pizza() {
		System.out.println("\n Welcome,Please follow the instructions....\n");
	}

	static String name;
	static int quantity;
	static double unitPrice = 2.99;
	static double priceToPay;

	public static void getInput() {
		Scanner mySc = new Scanner(System.in);

		System.out.println("Enter the name of Pizza : ");
		name = mySc.nextLine();

		System.out.println("Enter Quantity of slice :  ");
		quantity = mySc.nextInt();
	}

	public static void calculatation() {
		priceToPay = quantity * unitPrice;
	}

	public void desplayOutPut() {
		System.out.println("================");
		System.out.println("Name of Pizza is :  " + name);

		int discount;
		int quantityDiscount;
		if (quantity > 5 && quantity < 10) {
			discount = 1;
			quantityDiscount = quantity - discount;
			System.out.println("Quantity discount " + discount);
			System.out.println("Number of slice : " + quantityDiscount);
		} else if (quantity >= 10) {
			discount = 2;
			quantityDiscount = quantity - discount;
			System.out.println("Quantity discount " + discount);
			System.out.println("Number of slice : " + quantityDiscount);
		}

		System.out.println("Unit Price :   $" + unitPrice);
		System.out.println("================");
		System.out.println("Total to Pay :  $" + priceToPay);
	}

	public static void exit() {
		System.out.println();
		System.out.println("Thank you for coming and \"BONNE Appetit\" ");
	}

	public static void main(String[] args) {

	Pizza piz = new Pizza();

		boolean DoYouWantToContinue =true;
		do  {
			for (int i = 0; i < 5; i++) {

				Pizza.getInput();
				Pizza.calculatation();

			//	Pizza piz2 = new Pizza();
				piz.desplayOutPut();
				System.out.println("==========");
				System.out.println("do you want to continue ...");
				Scanner mySc1 = new Scanner(System.in);
				DoYouWantToContinue = mySc1.hasNext();
				
						}
			
		} while(DoYouWantToContinue = false);{
			
			Pizza.exit();
		}

	}

}
