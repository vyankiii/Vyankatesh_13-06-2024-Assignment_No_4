package com.stringAssignment;
//Q 2. Write a Java Program To Check Whether Two Strings Are Pangram.

public class PangramString {

	public static void main(String[] args) {

		String str1 = "Abcdefghijklmnopqrstuvwxyz";
		String str2 = "My name is Ram ";

		if (allLettersPresent(str1) && allLettersPresent(str2)) {
			System.out.println("Both strings are pangrams.");
		} else {
			System.out.println("At least one string is not a pangram.");
		}
	}

	static boolean allLettersPresent(String str) {
		str = str.toLowerCase();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				return false;
			}
		}
		return true;
	}
}
