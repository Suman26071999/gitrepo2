package programs;

import java.util.Scanner;

public class ThirdLarrgest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int firstlargest = arr[0];
		int secondlargest = arr[0];
		int thirdlargest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > firstlargest) {
				thirdlargest = secondlargest;
				secondlargest = firstlargest;
				firstlargest = arr[i];
			} else if (arr[i] > secondlargest) {
				thirdlargest = secondlargest;
				secondlargest = arr[i];
			} else if (arr[i] > thirdlargest) {
				thirdlargest = arr[i];
			}
		}

		System.out.println(firstlargest);
		System.out.println(secondlargest);
		System.out.println(thirdlargest);

	}
}
