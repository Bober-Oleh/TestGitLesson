package homework4;

import java.util.Scanner;

public class homework41 {
	 public static void main(String[] args) {

	int[] myArr = { 10, 5, 100, 300, 8, 4 };
System.out.println(maxValue(myArr));
	 }

	public static int maxValue(int array[]) {
		int max = array[0];
		for (int i : array) {

			if (i > max) {

				max = i;
			}
		}
		return max;
	}
}
