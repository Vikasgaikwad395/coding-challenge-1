package com.vkg.Question2;

import java.util.Scanner;

public class Problem {
	
	static final int no_of_chars = 256;
	static int longest(String word) {
		
		int n = word.length();
		int current = 1;
		int max = 1;
		int prev = 1;
		int visited[] = new int[no_of_chars];
		
		for(int i = 0; i < word.length(); i++) {
			visited[i]  = -1;			
		}
		visited[word.charAt(0)] = 0;
		for( int i = 1; i < n; i++) {
			prev = visited[word.charAt(i)];
			if(prev == -1 || i - current > prev) {
				current++;
			}else {
				if(current > max) {
					max = current;
					current = i - prev;
				}
				visited[word.charAt(i)] = i;
			}
			
		}
		if(current > max)
			max = current;
		return max;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word:- ");
		String word = in.next();
		System.out.println("Input: - " +word);
		int len =longest(word);
		System.out.println("Output: - "+ len);
	}
}
