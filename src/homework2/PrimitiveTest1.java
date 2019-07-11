package homework2;

import java.util.Scanner;

public class PrimitiveTest1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите радиус круга r: ");
		double r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Окружность с таким радиусом не существует");
			return;
		}
		double l = 2 * Math.PI * r;
		System.out.println(l);
	}
}