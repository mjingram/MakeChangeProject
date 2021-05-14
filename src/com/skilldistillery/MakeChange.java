package com.skilldistillery;

import java.util.*;

public class MakeChange {

	public static void main(String[] args) {
		//User Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Price: ");
		double price = input.nextDouble();
		System.out.println("Enter Amount Tendered: ");
		double tender = input.nextDouble();
		// Check difference in price and tender
		double difference = tender - price;
		// Convert To Pennies and Int
		int totalPennies = convertToPennies(difference);
		// Check if change is needed:
		if (totalPennies < 0) {
			System.out.println("Error! Not enough money tendered. Exiting program...");
			System.exit(1);
		} else if (totalPennies == 0) {
			System.out.println("Exact Payment! No Change");
		} else {
			System.out.println("Change: ");
			changeMaker(totalPennies);
		}
		input.close();

	}

	public static void changeMaker(int coin) {
		int twentyDollar = 0, tenDollar = 0, fiveDollar = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;
		// System.out.println("Entered Change Method");
		twentyDollar = coin / 2000;
		coin %= 2000;

		tenDollar = coin / 1000;
		coin %= 1000;

		fiveDollar = coin / 500;
		coin %= 500;

		oneDollar = coin / 100;
		coin %= 100;

		quarter = coin / 25;
		coin %= 25;

		dime = coin / 10;
		coin %= 10;

		nickel = coin / 5;
		coin %= 5;

		penny = coin;

		if (twentyDollar > 0) {
			System.out.println("Twenty Dollar Bills: " + twentyDollar);
		}
		if (tenDollar > 0) {
			System.out.println("Ten Dollar Bills: " + tenDollar);
		}
		if (fiveDollar > 0) {
			System.out.println("Five Dollar Bills: " + fiveDollar);
		}
		if (oneDollar > 0) {
			System.out.println("One Dollar Bills: " + oneDollar);
		}
		if (quarter > 0) {
			System.out.println("Quarters: " + quarter);
		}
		if (dime > 0) {
			System.out.println("Dime: " + dime);
		}
		if (nickel > 0) {
			System.out.println("Nickel: " + tenDollar);
		}
		if (penny > 0) {
			System.out.println("Pennies: " + penny);
		}

	}

	public static int convertToPennies(double amount) {
		int convert = (int) (amount * 100);
		// System.out.println("Convert Method Worked " + convert);
		return convert;

	}

}
