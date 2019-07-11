package homework4;
import java.util.Scanner;
public class homework44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите желаемое количество символов после запятой: ");
		int userLong = sc.nextInt();
	
		for (int n = 1; n <=  userLong; n++) {
			System.out.printf("%."+ n + "f", Math.PI);
			System.out.println();}
}
}