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

	public int fromRomanNumeralsToNormalDigit(String romanNumerals) {
		int result = 0;

		// Converting numbers between 1 qnd 10
		if (romanNumerals.contains("IX")) {
			result += 9;
		} else if (romanNumerals.contains("VIII")) {
			result += 8;
		} else if (romanNumerals.contains("VII")) {
			result += 7;
		} else if (romanNumerals.contains("VI")) {
			result += 6;
		} else if (romanNumerals.contains("IV")) {
			result += 4;
		} else if (romanNumerals.contains("V")) {
			result += 5;
		} else if (romanNumerals.contains("III")) {
			result += 3;
		} else if (romanNumerals.contains("II")) {
			result += 2;
		} else if (romanNumerals.contains("I")) {
			result += 1;
		}

		// Converting numbers between 10 qnd 100
		if (romanNumerals.contains("XC")) {
			result += 90;
		} else if (romanNumerals.contains("LXXX")) {
			result += 80;
		} else if (romanNumerals.contains("LXX")) {
			result += 70;
		} else if (romanNumerals.contains("LX")) {
			result += 60;
		} else if (romanNumerals.contains("XL")) {
			result += 40;
		} else if (romanNumerals.contains("L")) {
			result += 50;
		} else if (romanNumerals.contains("XXX")) {
			result += 30;
		} else if (romanNumerals.contains("XX")) {
			result += 20;
		} else if (romanNumerals.contains("X")) {
			result += 10;
		}
		// Converting numbers between 100 qnd 1000
		if (romanNumerals.contains("CM")) {
			result += 900;
		} else if (romanNumerals.contains("DCCC")) {
			result += 800;
		} else if (romanNumerals.contains("DCC")) {
			result += 700;
		} else if (romanNumerals.contains("DC")) {
			result += 600;
		} else if (romanNumerals.contains("CD")) {
			result += 400;
		} else if (romanNumerals.contains("D")) {
			result += 500;
		} else if (romanNumerals.contains("CCC")) {
			result += 300;
		} else if (romanNumerals.contains("CC")) {
			result += 200;
		} else if (romanNumerals.contains("C")) {
			result += 100;
		}

		// Converting thousands
		int nbThousands = 0;
		if (romanNumerals.contains("CM")) {
			nbThousands = romanNumerals.indexOf("CM");
		} else
			nbThousands = romanNumerals.lastIndexOf("M");
		result += nbThousands * 1000;
		return result;
	}
}
