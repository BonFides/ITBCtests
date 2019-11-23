package testovi;

import java.util.Scanner;

public class DiscoPayment {

	public static double calcDiscoValue(double value, int discount) {
		value -= ((value / 100) * discount);
		return value;
	}

	public static void main(String[] args) {
		/*
		 * If the value of good bought is more than 1500, calculate 10% discount. If the
		 * value of good bought is more than 7000, calculate 20% discount.
		 */
		Scanner sc = new Scanner(System.in);
		double lowerDiscoPrice = 1500;
		double higherDiscoPrice = 7000;
		int lowerDiscoRate = 10;
		int higherDiscoRate = 20;

		System.out.println("Enter value of goods you want to buy and see how much you need to pay after discount");
		double basePrice = sc.nextDouble();
		// Show price after discount
		if (basePrice <= 0) {
			System.out.println("Invalid input!");
		} else if (0 < basePrice && basePrice <= lowerDiscoPrice) {
			System.out.printf("No discount. Pay: $%.2f", basePrice);
		} else if (lowerDiscoPrice < basePrice && basePrice <= higherDiscoPrice) {
			System.out.printf("You have %d%% discount. Pay:$%.2f", lowerDiscoRate,
					calcDiscoValue(basePrice, lowerDiscoRate));
		} else if (higherDiscoPrice < basePrice) {
			System.out.printf("You have %d%% discount. Pay:$%.2f", higherDiscoRate,
					calcDiscoValue(basePrice, higherDiscoRate));
		}
	}
}
