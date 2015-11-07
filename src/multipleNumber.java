import java.util.Scanner;

public class multipleNumber {
	public static void main(String[] args) {
		int a, ul, ll, i;

		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter an Integer of Whose Multiples You Want to Print:");
		a = in.nextInt();

		System.out.println("Enter Lower Limit of Range:");
		ll = in.nextInt();

		System.out.println("Enter Upper Limit of Range:");
		ul = in.nextInt();

		in.close();

		for (i = ul - 1; i > ll; i--) {
			if (i % a == 0) {
				System.out.println(i);
			}
		}
	}
}