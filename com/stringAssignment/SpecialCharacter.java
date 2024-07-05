package com.stringAssignment;
//Q4 Write a java program to print special characters from a given string, the string is "ajayk_kumar@gmail.com".

public class SpecialCharacter {

	public static void main(String[] args) {
		String input = "ajayk_kumar@gmail.com";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isLetterOrDigit(ch)) {
				System.out.println("Special Charcters : " + ch);
			}
		}
	}
}
