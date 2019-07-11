import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i = 100;
		// byte b = i;
		//
		// short s = 10;
		// i = s ;
		//
		// int i = 100;
		// byte b = (byte)i;
		//
		// long l = 1000_000_000_000L;
		//
		// float f = 1.5f;
		//
		//
		// System.out.println(b);
		//
		// String s = "str";
		// char c = 1225;
		// System.out.println(c);
		//
		// boolean b = true;
		//
		// int i = 2 & 3 ;
		// System.out.println(i);
		//
		// System.out.println(1 > 0 ? "Yes" : "No");
		// Scanner sc= new Scanner (System.in);
		// int i = sc.nextInt();
		// System.out.println(i);

		// DZ- 2.1
		// Scanner sc = new Scanner(System.in);
		//
		// int number = sc.nextInt();
		// int[] array = new int[1];
		//
		// array[0] = number;
		// System.out.println(array);
		//

		//
		// int i = 1;
		// while (i < 8) {
		// System.out.print(i + " ");
		// i++;
		//
		// }
		// ДЗ - Треугольник
		// import java.util.Scanner;
		//
		// public class PrimitiveTest {
		//
		// public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Введите сторону треуголника a: ");
		// double a = sc.nextDouble();
		// System.out.print("Введите сторону треуголника b: ");
		// double b = sc.nextDouble();
		// System.out.print("Введите сторону треуголника c: ");
		// double c = sc.nextDouble();
		// if(a >= b + c || b >= a + c || c >= b + a) {
		// System.out.print("Треугольника с такими сторонами не существует");
		// return;
		// }
		// if ((a <= 0) || (b <= 0) || (c <= 0)) {
		// System.out.print("Сторона слишком коротка");
		// return;
		// }
		// double p = (a + b + c) / 2;
		// System.out.println(p);
		// double S = Math.sqrt(p*(p - a)*(p - b)*(p - c));
		// System.out.println(S);
		// }}
		////

		// ДЗ - Окружность

		//
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Введите радиус круга r: ");
		// double r = sc.nextDouble();
		// if(r<=0){
		// System.out.println("Окружность с таким радиусом не существует");
		// return;
		// }
		// double l = 2*Math.PI*r;
		// System.out.println(l);

		// ДЗ - Вывод числа в столбик
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Введите число n: ");
		// int n = sc.nextInt();
		// System.out.println(n);
		// for (int i = 6; i > 0; i--)
		// {
		// int m = n % 10;
		// System.out.println(m);
		// n /= 10;
		// }
		//
		// }}

		// Lessons 3кол

		// for (int i = 2; i < 100; i++) {
		//
		// for (int j = 2; j < i; j++)
		//
		// if ((i % j) != 0)
		// ;
		// {
		//
		// System.out.println(i + " - простое число.");
		// }
		// }
		// System.out.println();
		// }
		// }

		// Lessons 4
		// Cortirovka
		// String[] strings = { "abc", "y", "op", "bcd", "z" };
		// System.out.println(Arrays.toString(strings));
		// Arrays.sort(strings);
		// System.out.println(Arrays.toString(strings));
		//
		// Arrays.sort(strings, PrimitiveTest::reverse);
		// System.out.println(Arrays.toString(strings));
		// }
		//
		// public static int reverse(String str1, String str2){
		// return str2.compareTo(str1);
		// }
		// }

//		String[] strings = { "abc", "y", "op", "bcd", "z", "a" };
//		System.out.println(Arrays.toString(strings));
//		Arrays.sort(strings);
//		System.out.println(Arrays.toString(strings));
//
//		Arrays.sort(strings, PrimitiveTest::reverse);
//		System.out.println(Arrays.toString(strings));
//	}
//
	public static int reverse(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return 1;
		} else if (str1.length() < str2.length()) {
			return -1;
		} else {
			return 0;

		}
	}
}
