package ua.foxminded.javaspring;

import java.util.Scanner;

public class ColumnDivision {

	public static void main(String[] args) {
		System.out.println("Insert the number to be divided");
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		System.out.println("Insert divisor");
		sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		sc.close();

		ToDivision division = new ToDivision();
		System.out.println(division.toDivision(dividend, divisor));

	}

}
