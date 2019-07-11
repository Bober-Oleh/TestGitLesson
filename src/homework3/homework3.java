package homework3;

import java.util.Scanner;

public class homework3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введи количество вертикальных полос: ");
		int a = sc.nextInt();
		if (a<=0){System.out.println("Указанная величина мала");
		return;}

		System.out.print("введи ширину полос: ");
		int b = sc.nextInt();
		if (b<=0){System.out.println("Указанная величина мала");
		return;}

		System.out.print("введи высоту полос: ");
		int c = sc.nextInt();

		if (c<=0){System.out.println("Указанная величина мала");
		return;}

		for (int i = 0; i < c; i++) {
		
		if (a % 2 == 0) {
			for (int x = 0; x < a / 2; x++) {

				for (int y = 0; y < b; y++) {
					System.out.print("*");
				}
				for (int z = 0; z < b; z++) {
					System.out.print("+");
				}
			}
		} else {
			for (int x = 0; x < (a - 1) / 2; x++) {
				for (int y = 0; y < b; y++) {
					System.out.print("*");
				}
				for (int z = 0; z < b; z++) {
					System.out.print("+");
				}
			}
			for (int y = 0; y <b; y++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

}}
