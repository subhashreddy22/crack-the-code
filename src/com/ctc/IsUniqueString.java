package com.ctc;

import java.util.Scanner;

public class IsUniqueString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println("Is Unique? " + isUnique(s));
		
		sc.close();
	}
	
	public static boolean isUnique(String s) {
		
		if (s.length() > 128) {
			return false; // considering the string as an ASCII. So it has only 128 unique characters
		}
		
		boolean[] unique = new boolean[128];
		
		char[] charArray = s.toCharArray();
		
		for (char c : charArray) {
			if (unique[c]) {
				return false;
			}
			unique[c] = true;
		}
		return true;
	}
}
