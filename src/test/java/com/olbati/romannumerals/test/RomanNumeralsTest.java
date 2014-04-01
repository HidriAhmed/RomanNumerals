package com.olbati.romannumerals.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.olbati.romanumerals.RomanNumeralsConverter;

public class RomanNumeralsTest {

	@Test
	public void testConvertsFromNormalDigitToRomanNumerals() {
		RomanNumeralsConverter converter = new RomanNumeralsConverter();
		int intValue = 2751;
		String expectedRomanValue = "MMDCCLI";
		String resultRomanValue = converter
				.FromNormalDigitToRomanNumerals(intValue);
		System.out.println(intValue + " = " + resultRomanValue);

		assertThat(expectedRomanValue).isEqualTo(resultRomanValue);

	}
}
