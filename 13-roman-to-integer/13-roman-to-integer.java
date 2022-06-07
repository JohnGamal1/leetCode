import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = "";
		System.out.println("Input");
		inputString = input.nextLine();

		System.out.println(romanToInt(inputString));
	}

	private static int valueInInt(char r) {
		switch (r) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
		}
	}

	public static int romanToInt(String s) {
		int sum = 0;
		int previous = 0;

		for (int i = 0; i < s.length(); i++) {
			sum += valueInInt(s.charAt(i));
			if (previous < valueInInt(s.charAt(i)))
				sum -= (2 * previous);

			previous = valueInInt(s.charAt(i));
		}

		return sum;
	}
}
