package homework3;

public class homework2 {
	public static void main(String args[]) {

		System.out.println(1 + "- Простое число");
		int[] intArr = { 2, 3, 5, 7 };
		for (int m : intArr) {
			System.out.println(m + "- Простое число ");
		}
		for (int i = 10; i <= 100; i++) {
			boolean value = true;

			for (double j : intArr) {

				if ((i % j) == 0) {
					value = false;
				}
			}
			if (value)
				System.out.println(i + "- Простое число ");
		}
	}
}
		
		
