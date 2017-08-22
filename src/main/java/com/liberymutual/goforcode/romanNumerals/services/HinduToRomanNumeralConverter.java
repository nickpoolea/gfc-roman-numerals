package com.liberymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int input) {
		
//		String result = "";
//		
//		if (input / 10 >= 1) {
//			for (int i = 1; i <= Math.floor(input/10); i++) {
//				result += "X";
//			}
//		}
//		System.out.print(result);
//		return result;
		
		String[] characters = new String[] {"I", "V", "X", "L", "C", "D", "M"};
		String result = "";
		
		if (input < 4) {
			for (int i = 0; i < input; i++) {
				result += characters[0];
			}
		}
		
		else if (input == 4) {
			result += characters[0] + characters[1];
		}
		
		else if (input == 5) {
			result += characters[1];
		}
		
		else if (input < 9) {
			result += characters[1];
			for (int i = 0; i < input - 5; i++) {
				result += characters[0];
			}
		}
			else if (input == 9) {
				result += characters[2] + characters[1];
			}
		}
		
		return result;
	}
	
	
}
