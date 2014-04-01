package com.olbati.romanumerals;

public class RomanNumeralsConverter {

	/**
	 * this method converts normal digits to Roman Numerals
	 * 
	 * @param intValue
	 * @return
	 */
	public String fromNormalDigitToRomanNumerals(Integer intValue) {
		StringBuilder result = new StringBuilder();
		int nbThousands = intValue / 1000;
		int nbHundreds = (intValue % 1000) / 100;
		int nbDecades = (intValue % 100) / 10;
		int digit = intValue % 10;

		// counting number of thousands and generating the corresponding Roman
		// Symbol
		for (int i = 0; i < nbThousands; i++) {
			result.append('M');
		}

		// counting number of hundreds and generating the corresponding Roman
		// Symbol
		if (nbHundreds == 9) {
			result.append("CM");
		} else if (nbHundreds == 8) {
			result.append("DCCC");
		} else if (nbHundreds == 7) {
			result.append("DCC");
		} else if (nbHundreds == 6) {
			result.append("DC");
		} else if (nbHundreds == 5) {
			result.append("D");
		} else if (nbHundreds == 4) {
			result.append("CD");
		} else if (nbHundreds == 3) {
			result.append("CCC");
		} else if (nbHundreds == 2) {
			result.append("CC");
		} else if (nbHundreds == 1) {
			result.append("C");
		}

		// counting number of decades and generating the corresponding Roman
		// Symbol
		if (nbDecades == 9) {
			result.append("XC");
		} else if (nbDecades == 8) {
			result.append("XC");
		} else if (nbDecades == 7) {
			result.append("LXX");
		} else if (nbDecades == 6) {
			result.append("LX");
		} else if (nbDecades == 5) {
			result.append("L");
		} else if (nbDecades == 4) {
			result.append("XL");
		} else if (nbDecades == 3) {
			result.append("XXX");
		} else if (nbDecades == 2) {
			result.append("XX");
		} else if (nbDecades == 1) {
			result.append("X");
		}

		// counting number of digits and generating the corresponding Roman
		// Symbol
		if (digit == 9) {
			result.append("IX");
		} else if (digit == 8) {
			result.append("VIII");
		} else if (digit == 7) {
			result.append("VII");
		} else if (digit == 6) {
			result.append("VI");
		} else if (digit == 5) {
			result.append("V");
		} else if (digit == 4) {
			result.append("IV");
		} else if (digit == 3) {
			result.append("III");
		} else if (digit == 2) {
			result.append("II");
		} else if (digit == 1) {
			result.append("I");
		}

		return result.toString();
	}
}
