package com.bip;

public class RomanToIntTest {
	public static void main(String[] args) {
		String inputString = "XXVII";
		int calculate = calculate(inputString);
		System.out.println(calculate);
	}

	public static int calculate(String inputString) {
		int total = 0;
		int inputSTringLength = inputString.length();

		for (int i = 0; i < inputSTringLength; i++) {
			char fV = inputString.charAt(i);
			int fIntValue = value(fV);

			if ((i + 1) < inputSTringLength) {

				char sV = inputString.charAt(i + 1);
				int sIntValue = value(sV);

				if (fIntValue < sIntValue) {
					total = total - fIntValue;
				} else {
					total = total + fIntValue;
				}

			} else {
				total = total + fIntValue;
			}
		}
		return total;
	}

	public static int value(char ch) {
		switch (ch) {
		case 'I': {
			return 1;
		}
		case 'V': {
			return 5;
		}
		case 'X': {
			return 10;
		}
		case 'L': {
			return 50;
		}
		case 'C': {
			return 100;
		}
		case 'D': {
			return 500;
		}
		case 'M': {
			return 1000;
		}
		}
		return -1;
	}
}
