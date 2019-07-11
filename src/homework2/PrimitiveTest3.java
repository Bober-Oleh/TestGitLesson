package homework2;

import java.util.Scanner;

public class PrimitiveTest3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число n: ");
		int n = sc.nextInt();
		System.out.println(n);
		for (int i = 6; i > 0; i--) {
			int m = n % 10;
			System.out.println(m);
			n /= 10;
		}

	}
}
