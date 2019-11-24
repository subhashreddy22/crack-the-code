package com.ctc;

public class TowersOfHanoi {
	
	public static void main(String[] args) {
		
		toh(3, "A", "B", "C");
	}
	
	static void toh(int n, String from, String aux, String to) {
		
		if (n > 0) {
			
			toh(n - 1, from, to, aux);
			
			System.out.println("Move 1 disc from " + from + " to " + to);
			
			toh(n - 1, aux, from, to);
		}
		
	}
}
