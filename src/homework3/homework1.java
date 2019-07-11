package homework3;

import java.util.Scanner;

public class homework1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите максимальную высоту фигуры n: ");
		
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Неверно задано значение");
			return;}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		for (int m = n - 2; m >= 0; m--) {
			for (int k = 0; k < m + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}