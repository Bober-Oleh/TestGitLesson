package homework4;

import java.util.Scanner;

public class homework42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите высоту рисунка: ");
		int userHeight = sc.nextInt();
		if (userHeight < 2) {
			System.out.println("Слишком короткая сторона");
			return;
		}

		System.out.print("Введите ширину рисунка: ");
		int userWeight = sc.nextInt();
		if (userWeight< 2) {
			System.out.println("Слишком короткая сторона");
			return;
		}
		rectangle(userHeight, userWeight);
	}

	public static void rectangle(int userHeight, int userWeight) {

		for (int i = 0; i < userWeight - 1; i++) {
			System.out.print("+ ");
		}
		for (int j = 0; j < userHeight - 2; j++) {
			System.out.println("+ ");
			System.out.print("+ ");
			for (int k = 0; k < userWeight - 2; k++) {
				System.out.print("  ");
			}
		}
		System.out.print("+ ");
		System.out.println();
		for (int m = 0; m < userWeight; m++) {
			System.out.print("+ ");
		}
		System.out.println();
	}
}
