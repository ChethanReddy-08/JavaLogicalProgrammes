package scanner_Class;

import java.util.Scanner;

public class Pgm154_Armstrong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = sc.nextInt();
		sc.close();
		int copy = no;
		int size = no;
		int count = 0;
		int sum = 0;
		while (size != 0) {
			count++;
			size = size / 10;
		}
		while (no != 0) {
			int rem = no % 10;
			int mul = 1;
			for (int i = 1; i <= count; i++) {
				mul = mul * rem;
			}
			sum = sum + mul;
			no = no / 10;
		}
		if (copy == sum) {
			System.out.println(copy + " is an Armstrong Number");
		} else {
			System.out.println(copy + " is not an Armstrong Number");
		}
	}
}
