package scanner_Class;

import java.util.Scanner;

public class Pgm153_Armstrong_Number_Using_Inbuilt_Methods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = sc.nextInt();
		sc.close();
		int length = String.valueOf(no).length();
		int sum = 0;
		int copy = no;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + ((int) Math.pow(rem, length));
			no = no / 10;
		}
		if (copy == sum) {
			System.out.println(copy + " is an Armstrong Number");
		} else {
			System.out.println(copy + " is not an Armstrong Number");
		}
	}
}
