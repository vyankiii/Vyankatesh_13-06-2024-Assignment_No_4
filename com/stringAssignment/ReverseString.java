package com.stringAssignment;
//Q 6] Write a Java program to reverse a string
public class ReverseString {

	public static void main(String[] args) {
		String original = "Vyankiii";
		String reverse = "";
		for (int i = 0; i < original.length(); i++) {
			reverse = original.charAt(i) + reverse;
		}
		System.out.println("Reversed string: " + reverse);
	}
}
