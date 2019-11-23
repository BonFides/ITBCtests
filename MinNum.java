package testovi;

import java.util.Scanner;

public class MinNum {

	public static void main(String[] args) {
		// Input n numbers and show minimum

		Scanner sc = new Scanner(System.in);

		System.out.println("From how many numbers entered you want to find minimum: ");
		int arrVolume = sc.nextInt();

		if (arrVolume <= 0) {
			System.out.println("Error: invalid input");
		} else {
			// Create an array of numbers entered by user
			double[] arr = new double[arrVolume];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Input number:");
				arr[i] = sc.nextDouble();
			}
			// Find minimum value
			double minVal = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (minVal > arr[i]) {
					minVal = arr[i];
				}
			}
			System.out.printf("From %d numbers you entered, minimum is number %.2f", arrVolume, minVal);
		}
	}
}
