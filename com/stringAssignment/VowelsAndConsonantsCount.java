package com.stringAssignment;
//Q 3. Write a java program to get the vowels and consonants characters count from a given string, the string is "Welcome to Java Programming".

public class VowelsAndConsonantsCount {

	public static void main(String[] args) {

		String input = "Welcome to Java Programming";
		input = input.toLowerCase(); // Convert to lowercase

		int vowelsCount = 0;
		int consonantsCount = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelsCount++;
				} else {
					consonantsCount++;
				}
			}
		}

		System.out.println("Number of vowels: " + vowelsCount);
		System.out.println("Number of consonants: " + consonantsCount);
	}
}
