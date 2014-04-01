package com.olbati.romannumerals.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.olbati.romanumerals.RomanNumeralsConverter;

public class RomanNumeralsTest {

	RomanNumeralsConverter converter;

	@Before
	public void init() {
		converter = new RomanNumeralsConverter();
	}

	/**
	 * tests the conversion from normal digits to Roman Numerals
	 */
	@Test
	public void testConvertsFromNormalDigitToRomanNumerals() {

		int intValue = 2751;
		String expectedRomanValue = "MMDCCLI";
		String resultRomanValue = converter
				.fromNormalDigitToRomanNumerals(intValue);
		System.out.println(intValue + " = " + resultRomanValue);

		assertThat(expectedRomanValue).isEqualTo(resultRomanValue);

	}

	/**
	 * tests the conversion from Roman numerals to normal digits
	 */
	@Test
	public void testConvertsFromRomanSymbolsToNormalDigits() {
		String romanNumber = "MCMXCIX";
		int expectedIntegerNumber = 1999;
		int resultNormalDigits = converter
				.fromRomanNumeralsToNormalDigit(romanNumber);
		System.out.println(romanNumber + " = " + resultNormalDigits);
		assertThat(expectedIntegerNumber).isEqualTo(resultNormalDigits);
	}
}
