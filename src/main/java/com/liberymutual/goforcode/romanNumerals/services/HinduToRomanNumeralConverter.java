package com.liberymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int input) {
		
		String[] characters = new String[] {"I", "V", "X", "L", "C", "D", "M"};
		String result = "";
		int numberToAnalyze;
		int arrayIndex = 0;
		
		while (input > 0) {
			
			//Loop through each individual digit
			numberToAnalyze = input % 10;
		
			if (numberToAnalyze == 0) {
				//do nothing
			}
			
			else if (numberToAnalyze < 4) {
				for (int j = 0; j < numberToAnalyze; j++) {
					result = characters[arrayIndex] + result;
				}
			}
			
			else if (numberToAnalyze == 4) {
				result = characters[arrayIndex] + characters[arrayIndex + 1] + result;
			}
			
			else if (numberToAnalyze == 5) {
				result = characters[arrayIndex + 1] + result;
			}
			
			else if (numberToAnalyze < 9) {
				for (int j = 0; j < numberToAnalyze - 5; j++) {
					result = characters[arrayIndex] + result;
				}
				result = characters[arrayIndex + 1] + result;
			}
			
			else if (numberToAnalyze == 9) {
				result = characters[arrayIndex] + characters[arrayIndex + 2] + result;
			}
			
			arrayIndex += 2;
			input /= 10;
						
		}
		
		return result;
	}
	
	
}
