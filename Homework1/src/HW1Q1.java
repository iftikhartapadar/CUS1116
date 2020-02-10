/**
 * CUS-1116
 * HW1 Q1
 * @author Iftikhar Tapadar
 * Date: 02/09/2020
 */
public class HW1Q1 {

	public static void main(String[] args) {

		// a)1 2 3 4 5 6 7 8 9 10
		int[] values = new int[10];

		System.out.println("Output for: Hw1 Q1, part a");

		for (int i = 0; i < 10; i++) {
			values[i] = i + 1;
			System.out.print(values[i] + " ");
		}

		System.out.println();
		System.out.println("--------------------------------");

		// b) 0 2 4 6 8 10 12 14 16 18 20
		values = new int[11];

		System.out.println("Output for: Hw1 Q1, part b");

		for (int i = 0; i <= 10; i++) {
			values[i] = i * 2;
			System.out.print(values[i] + " ");
		}

		System.out.println();
		System.out.println("--------------------------------");

		// c) 1 4 9 16 25 36 49 64 81 100
		values = new int[11];

		System.out.println("Output for: Hw1 Q1, part c");

		for (int i = 1; i < 11; i++) {
			values[i] = i * i;
			System.out.print(values[i] + " ");
		}

		System.out.println();
		System.out.println("--------------------------------");

		// d) d. 0 0 0 0 0 0 0 0 0 0
		System.out.println("Output for: Hw1 Q1, part d");

		values = new int[10];

		for (int i = 0; i < 10; i++) {
			values[i] = i * 0;
			System.out.print(values[i] + " ");
		}

		System.out.println();
		System.out.println("--------------------------------");

		// e) 1 4 9 16 9 7 4 9 11
		System.out.println("Output for: Hw1 Q1, part e");

		values = new int[]{ 1, 4, 9, 16, 9, 7, 4, 9, 11 };

		for (int i = 0; i < 9; i++) {
			System.out.print(values[i] + " ");
		}

		System.out.println();
		System.out.println("--------------------------------");

		// f) 0 1 0 1 0 1 0 1 0 1
		values = new int[10];

		System.out.println("Output for: Hw1 Q1, part f");

		for (int i = 0; i < 10; i++) {
			values[i] = i % 2;
			System.out.print(values[i] + " ");
		}

		System.out.println();
		System.out.println("--------------------------------");

		// g) 0 1 2 3 4 0 1 2 3 4
		values = new int[10];

		System.out.println("Output for: Hw1 Q1, part g");

		for (int i = 0; i < 10; i++) {
			values[i] = i % 5;
			System.out.print(values[i] + " ");
		}

		System.out.println();
		System.out.println("--------------------------------");

	}

}
