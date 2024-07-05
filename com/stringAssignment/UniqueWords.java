package com.stringAssignment;
//Q 1.Write Java program to print all unique words present in the string.

public class UniqueWords {

	public static void main(String[] args) {
		
		String input = "Welcome to java Programming.";

		String[] words = input.split("\\W");
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					count++;
					words[j] = "";
				}
			}
			if (count == 1 && !words[i].isEmpty()) {
				System.out.println(words[i]);
			}

		}
	}

}
