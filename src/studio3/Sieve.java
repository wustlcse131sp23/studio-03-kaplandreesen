package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give an integer greater than 1 ");
		int n = in.nextInt();
		boolean[] toFill = new boolean[n];
		Arrays.fill(toFill, true);
		int c = 2;
		for (int x = 2; x < n / 2; x++) {
			for (int y = 2 * x; y <n; y += x) {
				toFill[y] = false;
			}
		}
		while (c < n) {

			if (toFill[c] == true) {
				System.out.println(c);
			}
			c++;
		}
	}

}
