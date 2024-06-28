package programs;

import java.util.Scanner;

public class ThirdSmallNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter elements");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int firstsmallest = max;
		int secondsmallest = max;
		int thirdsmallest = max;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstsmallest) {
				thirdsmallest = secondsmallest;
				secondsmallest = firstsmallest;
				firstsmallest = arr[i];
			} else if (arr[i] < secondsmallest) {
				thirdsmallest = secondsmallest;
				secondsmallest = arr[i];
			} else if (arr[i] < thirdsmallest) {
				thirdsmallest = arr[i];
			}
		}
		System.out.println(firstsmallest);
		System.out.println(secondsmallest);
		System.out.println(thirdsmallest);

	}

}
