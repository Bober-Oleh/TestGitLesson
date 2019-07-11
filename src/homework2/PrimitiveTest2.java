package homework2;

import java.util.Scanner;

public class PrimitiveTest2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите сторону треуголника a: ");
		double a = sc.nextDouble();
		System.out.print("Введите сторону треуголника b: ");
		double b = sc.nextDouble();
		System.out.print("Введите сторону треуголника c: ");
		double c = sc.nextDouble();
		if (a >= b + c || b >= a + c || c >= b + a) {
			System.out.print("Треугольника с такими сторонами не существует");
			return;
		}
		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			System.out.print("Сторона слишком коротка");
			return;
		}
		double p = (a + b + c) / 2;
		System.out.println(p);
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println(S);
	}
}
