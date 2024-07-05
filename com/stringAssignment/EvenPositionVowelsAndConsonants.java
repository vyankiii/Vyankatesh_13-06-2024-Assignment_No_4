package com.stringAssignment;

public class EvenPositionVowelsAndConsonants {

	public static void main(String[] args) {
		
		String input = "Get whatsapp for windows";
		input = input.toLowerCase(); // Convert to lowercase

		int evenPositionVowels = 0;
		int evenPositionConsonants = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i % 2 == 0) { // Check even positions
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					evenPositionVowels++;
				} else if (Character.isLetter(ch)) {
					evenPositionConsonants++;
				}
			}
		}

		System.out.println("Even position vowels count: " + evenPositionVowels);
		System.out.println("Even position consonants count: " + evenPositionConsonants);
	}
}
